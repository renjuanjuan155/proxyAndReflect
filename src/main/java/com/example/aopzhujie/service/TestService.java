package com.example.aopzhujie.service;

import com.example.aopzhujie.dto.ItongjiUsers;
import com.example.aopzhujie.dto.MobileDiffDto;
import com.example.aopzhujie.dto.MobileIsNullDto;
import com.example.aopzhujie.dto.MobileSameDto;
import com.example.aopzhujie.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Leo
 * @date 2021/4/1
 */
@Service("testService")
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public void getDataOne(){

        //查出手机号相同的用户id
        List<MobileSameDto> mobileSameDtos = testMapper.getdataOne();
        //查询手机号相同的用户判断在ldc中itongji的用户id是否一样，如果不一样则将在ldc中关联的用户id都替换为itongji中的id
        for (MobileSameDto dto: mobileSameDtos){
            if (dto.getItongjiId() != dto.getLdcId()){
                //执行替换ldc中关联用户id的操作
                //
                testMapper.updateLdcToItongjiId(dto.getItongjiId(),dto.getLdcId());

            }
        }

        //查询ldc中没有在itongji中的用户id，将该用户的信息添加到itongji中，并更新关联的数据
        List<MobileDiffDto> ldcMobileNotInintongji = testMapper.getLdcMobileNotInintongji();
        if (ldcMobileNotInintongji != null && ldcMobileNotInintongji.size() > 0){
            for (MobileDiffDto dto: ldcMobileNotInintongji){

                //将ldc中的数据查询出来
                ItongjiUsers ldcusersById = testMapper.getLdcusersById(dto.getLdcId());
                Long aLong = testMapper.saveItongjiUsers(ldcusersById);
                //将原来ldcusersById的id关联的数据都换成asLong
                //替换ldc_course_vip表中的数据
                testMapper.updateLdcToItongjiId(aLong,ldcusersById.getId());
            }
        }

        List<Long> mobileIsNullLdcUsers = testMapper.getMobileIsNullLdcUsers();

        List<Long> mobileIsNullUsers = testMapper.getMobileIsNullUsers();

        List<MobileIsNullDto> mobileIsNull = testMapper.getMobileIsNull();

        //将相同信息的信息集合与ldcUsers中的id进行求差
        List<Long> longs = removeAll(mobileIsNullLdcUsers, mobileIsNullUsers);



    }

    public  static List<Long> removeAll(List<Long> list1,List<Long> list2){

        LinkedList<Long> result = new LinkedList<Long>(list1);
        HashSet<Long> set = new HashSet<Long>(list1);
        Iterator<Long> itor = result.iterator();
        while(itor.hasNext()){
            if(set.contains(itor.next())){
                itor.remove();
            }
        }
        return result;
    }


}

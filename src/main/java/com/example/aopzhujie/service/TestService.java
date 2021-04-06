package com.example.aopzhujie.service;

import com.example.aopzhujie.dto.*;
import com.example.aopzhujie.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;




@Service
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
                testMapper.updateCourseWorkSubmit(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateCourseWorkSubmitReply(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcForumPost(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcForumPostAttention(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcForumPostLike(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcForumPostReply(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcgraduationReg(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcLearnedSection(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcMsg(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcPointExechangeRecord(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcUserResource(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcVipInfo(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestion(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestionAnswer(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestionAnswerLike(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestionCollection(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestionForwarding(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestionLike(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateSpecial(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateSpecialAttention(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateUserFeedback(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateUserPoint(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateUserPointDetail(dto.getItongjiId(),dto.getLdcId());

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
                testMapper.updateCourseWorkSubmit(aLong,ldcusersById.getId());
                testMapper.updateCourseWorkSubmitReply(aLong,ldcusersById.getId());
                testMapper.updateLdcForumPost(aLong,ldcusersById.getId());
                testMapper.updateLdcForumPostAttention(aLong,ldcusersById.getId());
                testMapper.updateLdcForumPostLike(aLong,ldcusersById.getId());
                testMapper.updateLdcForumPostReply(aLong,ldcusersById.getId());
                testMapper.updateLdcgraduationReg(aLong,ldcusersById.getId());
                testMapper.updateLdcLearnedSection(aLong,ldcusersById.getId());
                testMapper.updateLdcMsg(aLong,ldcusersById.getId());
                testMapper.updateLdcPointExechangeRecord(aLong,ldcusersById.getId());
                testMapper.updateLdcUserResource(aLong,ldcusersById.getId());
                testMapper.updateLdcVipInfo(aLong,ldcusersById.getId());
                testMapper.updateQuestion(aLong,ldcusersById.getId());
                testMapper.updateQuestionAnswer(aLong,ldcusersById.getId());
                testMapper.updateQuestionAnswerLike(aLong,ldcusersById.getId());
                testMapper.updateQuestionCollection(aLong,ldcusersById.getId());
                testMapper.updateQuestionForwarding(aLong,ldcusersById.getId());
                testMapper.updateQuestionLike(aLong,ldcusersById.getId());
                testMapper.updateSpecial(aLong,ldcusersById.getId());
                testMapper.updateSpecialAttention(aLong,ldcusersById.getId());
                testMapper.updateUserFeedback(aLong,ldcusersById.getId());
                testMapper.updateUserPoint(aLong,ldcusersById.getId());
                testMapper.updateUserPointDetail(aLong,ldcusersById.getId());
            }
        }

        //查询ldc_users中的mobile为空或者‘’的id
        List<Long> mobileIsNullLdcUsers = testMapper.getMobileIsNullLdcUsers();

        //查询出users中mobile为空或者‘’的id
        List<Long> mobileIsNullUsers = testMapper.getMobileIsNullUsers();

        //查询出ldc_users和users中mobile为空或‘’时,其余不为空时，信息相等的id
        List<MobileIsNullDto> mobileIsNull = testMapper.getMobileIsNull();

        //sessionisKey和mobile为空时得到的相同的id
        List<Long> mobileIsNullsessionisKeynull = testMapper.getMobileIsNullsessionisKeynull();

        //OpenId和mobile为空时得到的相同的id
        List<Long> mobileIsNullOpenIdNull = testMapper.getMobileIsNullOpenIdNull();

        //Site和mobile为空时得到的相同的id
        List<Long> mobileisNullSiteIsNull = testMapper.getMobileisNullSiteIsNull();

        List<Long> ldcNull = testMapper.getLdcNull();

        List<MobileNullDto> usersNull = testMapper.getUsersNull();




        //将相同信息的信息集合与ldcUsers中的id进行求差，剩余的就是mobile为‘’或者为空信息不相等的，将这些usersId进行转移到users表汇总
        List<Long> longs = removeAll(mobileIsNullLdcUsers, mobileIsNullUsers);

        List<Long> longs1 = removeAll(longs, mobileIsNullsessionisKeynull);

        List<Long> longs2 = removeAll(longs1, mobileIsNullOpenIdNull);

        List<Long> longs3 = removeAll(longs2, mobileisNullSiteIsNull);

        List<Long> longs4 = removeAll(longs3, ldcNull);


        //先根据求差后的集合中的id查询出每一个用户的信息
        for(Long id: longs4){
            //将ldc中的数据查询出来
            ItongjiUsers ldcusersById = testMapper.getLdcusersById(id);
            Long aLong = testMapper.saveItongjiUsers(ldcusersById);
            //将原来ldcusersById的id关联的数据都换成asLong
            //替换ldc_course_vip表中的数据
            testMapper.updateLdcToItongjiId(aLong,ldcusersById.getId());
            testMapper.updateCourseWorkSubmit(aLong,ldcusersById.getId());
            testMapper.updateCourseWorkSubmitReply(aLong,ldcusersById.getId());
            testMapper.updateLdcForumPost(aLong,ldcusersById.getId());
            testMapper.updateLdcForumPostAttention(aLong,ldcusersById.getId());
            testMapper.updateLdcForumPostLike(aLong,ldcusersById.getId());
            testMapper.updateLdcForumPostReply(aLong,ldcusersById.getId());
            testMapper.updateLdcgraduationReg(aLong,ldcusersById.getId());
            testMapper.updateLdcLearnedSection(aLong,ldcusersById.getId());
            testMapper.updateLdcMsg(aLong,ldcusersById.getId());
            testMapper.updateLdcPointExechangeRecord(aLong,ldcusersById.getId());
            testMapper.updateLdcUserResource(aLong,ldcusersById.getId());
            testMapper.updateLdcVipInfo(aLong,ldcusersById.getId());
            testMapper.updateQuestion(aLong,ldcusersById.getId());
            testMapper.updateQuestionAnswer(aLong,ldcusersById.getId());
            testMapper.updateQuestionAnswerLike(aLong,ldcusersById.getId());
            testMapper.updateQuestionCollection(aLong,ldcusersById.getId());
            testMapper.updateQuestionForwarding(aLong,ldcusersById.getId());
            testMapper.updateQuestionLike(aLong,ldcusersById.getId());
            testMapper.updateSpecial(aLong,ldcusersById.getId());
            testMapper.updateSpecialAttention(aLong,ldcusersById.getId());
            testMapper.updateUserFeedback(aLong,ldcusersById.getId());
            testMapper.updateUserPoint(aLong,ldcusersById.getId());
            testMapper.updateUserPointDetail(aLong,ldcusersById.getId());
        }

        //将两个表信息相等的id进行处理，将ldc_users表中的信息都与users表中的数据进行处理
        //判断两个表中的数据是否都是一样的
        for (MobileIsNullDto dto: mobileIsNull){
            if (dto.getItongjiId() != dto.getLdcId()){
                //执行替换ldc中关联用户id的操作
                //替换爱数据学院，用户关联课程表中的userId
                testMapper.updateLdcToItongjiId(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateCourseWorkSubmit(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateCourseWorkSubmitReply(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcForumPost(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcForumPostAttention(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcForumPostLike(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcForumPostReply(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcgraduationReg(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcLearnedSection(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcMsg(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcPointExechangeRecord(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcUserResource(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateLdcVipInfo(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestion(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestionAnswer(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestionAnswerLike(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestionCollection(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestionForwarding(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateQuestionLike(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateSpecial(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateSpecialAttention(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateUserFeedback(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateUserPoint(dto.getItongjiId(),dto.getLdcId());
                testMapper.updateUserPointDetail(dto.getItongjiId(),dto.getLdcId());

            }
        }

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

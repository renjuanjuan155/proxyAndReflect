package com.example.aopzhujie.mapper;

import com.example.aopzhujie.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Leo
 * @date 2021/4/1
 */

@Mapper
public interface TestMapper {

    List<MobileSameDto> getdataOne();

    List<MobileDiffDto> getLdcMobileNotInintongji();

    List<Long> getLdc();

    List<Long> getUser();

    ItongjiUsers getLdcusersById(@Param("id") Long id);

    Long saveItongjiUsers(ItongjiUsers itongjiUsers);

    void updateLdcToItongjiId(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    List<Long> getMobileIsNullLdcUsers();

    List<Long> getMobileIsNullUsers();

    List<MobileIsNullDto> getMobileIsNull();

    List<Long> getMobileIsNullsessionisKeynull();

    List<Long> getMobileIsNullOpenIdNull();

    List<Long> getMobileisNullSiteIsNull();

    List<Long> getLdcNull();

    List<MobileNullDto> getUsersNull();

    void updateCourseWorkSubmit(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateCourseWorkSubmitReply(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateLdcForumPost(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateLdcForumPostAttention(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateLdcForumPostLike(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateLdcForumPostReply(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateLdcgraduationReg(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateLdcLearnedSection(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateLdcMsg(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateLdcPointExechangeRecord(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateLdcUserResource(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateLdcVipInfo(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateQuestion(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateQuestionAnswer(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateQuestionAnswerLike(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateQuestionCollection(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateQuestionForwarding(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateQuestionLike(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateSpecial(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateSpecialAttention(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateUserFeedback(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateUserPoint(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);

    void updateUserPointDetail(@Param("itongjiId") Long itongjiId,@Param("ldcId") Long ldcId);
}

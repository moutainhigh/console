package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblChannelCheckFileInfoDO;
import com.allcheer.bpos.entity.TblChannelCheckFileInfoDOExample;
import com.allcheer.bpos.entity.TblChannelCheckFileInfoDOKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblChannelCheckFileInfoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_CHECK_FILE_INFO
     *
     * @mbggenerated
     */
    int countByExample(TblChannelCheckFileInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_CHECK_FILE_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(TblChannelCheckFileInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_CHECK_FILE_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(TblChannelCheckFileInfoDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_CHECK_FILE_INFO
     *
     * @mbggenerated
     */
    int insert(TblChannelCheckFileInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_CHECK_FILE_INFO
     *
     * @mbggenerated
     */
    int insertSelective(TblChannelCheckFileInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_CHECK_FILE_INFO
     *
     * @mbggenerated
     */
    List<TblChannelCheckFileInfoDO> selectByExample(TblChannelCheckFileInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_CHECK_FILE_INFO
     *
     * @mbggenerated
     */
    TblChannelCheckFileInfoDO selectByPrimaryKey(TblChannelCheckFileInfoDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_CHECK_FILE_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblChannelCheckFileInfoDO record, @Param("example") TblChannelCheckFileInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_CHECK_FILE_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblChannelCheckFileInfoDO record, @Param("example") TblChannelCheckFileInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_CHECK_FILE_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TblChannelCheckFileInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_CHANNEL_CHECK_FILE_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TblChannelCheckFileInfoDO record);
}
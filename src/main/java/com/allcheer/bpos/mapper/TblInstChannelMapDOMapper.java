package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblInstChannelMapDO;
import com.allcheer.bpos.entity.TblInstChannelMapDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblInstChannelMapDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_CHANNEL_MAP
     *
     * @mbggenerated
     */
    int countByExample(TblInstChannelMapDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_CHANNEL_MAP
     *
     * @mbggenerated
     */
    int deleteByExample(TblInstChannelMapDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_CHANNEL_MAP
     *
     * @mbggenerated
     */
    int insert(TblInstChannelMapDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_CHANNEL_MAP
     *
     * @mbggenerated
     */
    int insertSelective(TblInstChannelMapDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_CHANNEL_MAP
     *
     * @mbggenerated
     */
    List<TblInstChannelMapDO> selectByExample(TblInstChannelMapDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_CHANNEL_MAP
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblInstChannelMapDO record, @Param("example") TblInstChannelMapDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_CHANNEL_MAP
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblInstChannelMapDO record, @Param("example") TblInstChannelMapDOExample example);
}
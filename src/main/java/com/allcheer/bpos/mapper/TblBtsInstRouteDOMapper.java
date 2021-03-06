package com.allcheer.bpos.mapper;

import com.allcheer.bpos.entity.TblBtsInstRouteDO;
import com.allcheer.bpos.entity.TblBtsInstRouteDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblBtsInstRouteDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_ROUTE
     *
     * @mbggenerated
     */
    int countByExample(TblBtsInstRouteDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_ROUTE
     *
     * @mbggenerated
     */
    int deleteByExample(TblBtsInstRouteDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_ROUTE
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer routeSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_ROUTE
     *
     * @mbggenerated
     */
    int insert(TblBtsInstRouteDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_ROUTE
     *
     * @mbggenerated
     */
    int insertSelective(TblBtsInstRouteDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_ROUTE
     *
     * @mbggenerated
     */
    List<TblBtsInstRouteDO> selectByExample(TblBtsInstRouteDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_ROUTE
     *
     * @mbggenerated
     */
    TblBtsInstRouteDO selectByPrimaryKey(Integer routeSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_ROUTE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TblBtsInstRouteDO record, @Param("example") TblBtsInstRouteDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_ROUTE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TblBtsInstRouteDO record, @Param("example") TblBtsInstRouteDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_ROUTE
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TblBtsInstRouteDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_INST_ROUTE
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TblBtsInstRouteDO record);

    int getId();
}
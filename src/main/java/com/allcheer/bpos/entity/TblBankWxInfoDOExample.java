package com.allcheer.bpos.entity;

import java.util.ArrayList;
import java.util.List;

public class TblBankWxInfoDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    public TblBankWxInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGateIdIsNull() {
            addCriterion("GATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andGateIdIsNotNull() {
            addCriterion("GATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGateIdEqualTo(String value) {
            addCriterion("GATE_ID =", value, "gateId");
            return (Criteria) this;
        }

        public Criteria andGateIdNotEqualTo(String value) {
            addCriterion("GATE_ID <>", value, "gateId");
            return (Criteria) this;
        }

        public Criteria andGateIdGreaterThan(String value) {
            addCriterion("GATE_ID >", value, "gateId");
            return (Criteria) this;
        }

        public Criteria andGateIdGreaterThanOrEqualTo(String value) {
            addCriterion("GATE_ID >=", value, "gateId");
            return (Criteria) this;
        }

        public Criteria andGateIdLessThan(String value) {
            addCriterion("GATE_ID <", value, "gateId");
            return (Criteria) this;
        }

        public Criteria andGateIdLessThanOrEqualTo(String value) {
            addCriterion("GATE_ID <=", value, "gateId");
            return (Criteria) this;
        }

        public Criteria andGateIdLike(String value) {
            addCriterion("GATE_ID like", value, "gateId");
            return (Criteria) this;
        }

        public Criteria andGateIdNotLike(String value) {
            addCriterion("GATE_ID not like", value, "gateId");
            return (Criteria) this;
        }

        public Criteria andGateIdIn(List<String> values) {
            addCriterion("GATE_ID in", values, "gateId");
            return (Criteria) this;
        }

        public Criteria andGateIdNotIn(List<String> values) {
            addCriterion("GATE_ID not in", values, "gateId");
            return (Criteria) this;
        }

        public Criteria andGateIdBetween(String value1, String value2) {
            addCriterion("GATE_ID between", value1, value2, "gateId");
            return (Criteria) this;
        }

        public Criteria andGateIdNotBetween(String value1, String value2) {
            addCriterion("GATE_ID not between", value1, value2, "gateId");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNull() {
            addCriterion("MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNotNull() {
            addCriterion("MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerIdEqualTo(String value) {
            addCriterion("MER_ID =", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotEqualTo(String value) {
            addCriterion("MER_ID <>", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThan(String value) {
            addCriterion("MER_ID >", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("MER_ID >=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThan(String value) {
            addCriterion("MER_ID <", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThanOrEqualTo(String value) {
            addCriterion("MER_ID <=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLike(String value) {
            addCriterion("MER_ID like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotLike(String value) {
            addCriterion("MER_ID not like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdIn(List<String> values) {
            addCriterion("MER_ID in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotIn(List<String> values) {
            addCriterion("MER_ID not in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdBetween(String value1, String value2) {
            addCriterion("MER_ID between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotBetween(String value1, String value2) {
            addCriterion("MER_ID not between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andAvailAmtIsNull() {
            addCriterion("AVAIL_AMT is null");
            return (Criteria) this;
        }

        public Criteria andAvailAmtIsNotNull() {
            addCriterion("AVAIL_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andAvailAmtEqualTo(String value) {
            addCriterion("AVAIL_AMT =", value, "availAmt");
            return (Criteria) this;
        }

        public Criteria andAvailAmtNotEqualTo(String value) {
            addCriterion("AVAIL_AMT <>", value, "availAmt");
            return (Criteria) this;
        }

        public Criteria andAvailAmtGreaterThan(String value) {
            addCriterion("AVAIL_AMT >", value, "availAmt");
            return (Criteria) this;
        }

        public Criteria andAvailAmtGreaterThanOrEqualTo(String value) {
            addCriterion("AVAIL_AMT >=", value, "availAmt");
            return (Criteria) this;
        }

        public Criteria andAvailAmtLessThan(String value) {
            addCriterion("AVAIL_AMT <", value, "availAmt");
            return (Criteria) this;
        }

        public Criteria andAvailAmtLessThanOrEqualTo(String value) {
            addCriterion("AVAIL_AMT <=", value, "availAmt");
            return (Criteria) this;
        }

        public Criteria andAvailAmtLike(String value) {
            addCriterion("AVAIL_AMT like", value, "availAmt");
            return (Criteria) this;
        }

        public Criteria andAvailAmtNotLike(String value) {
            addCriterion("AVAIL_AMT not like", value, "availAmt");
            return (Criteria) this;
        }

        public Criteria andAvailAmtIn(List<String> values) {
            addCriterion("AVAIL_AMT in", values, "availAmt");
            return (Criteria) this;
        }

        public Criteria andAvailAmtNotIn(List<String> values) {
            addCriterion("AVAIL_AMT not in", values, "availAmt");
            return (Criteria) this;
        }

        public Criteria andAvailAmtBetween(String value1, String value2) {
            addCriterion("AVAIL_AMT between", value1, value2, "availAmt");
            return (Criteria) this;
        }

        public Criteria andAvailAmtNotBetween(String value1, String value2) {
            addCriterion("AVAIL_AMT not between", value1, value2, "availAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtIsNull() {
            addCriterion("USE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andUseAmtIsNotNull() {
            addCriterion("USE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andUseAmtEqualTo(String value) {
            addCriterion("USE_AMT =", value, "useAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtNotEqualTo(String value) {
            addCriterion("USE_AMT <>", value, "useAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtGreaterThan(String value) {
            addCriterion("USE_AMT >", value, "useAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtGreaterThanOrEqualTo(String value) {
            addCriterion("USE_AMT >=", value, "useAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtLessThan(String value) {
            addCriterion("USE_AMT <", value, "useAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtLessThanOrEqualTo(String value) {
            addCriterion("USE_AMT <=", value, "useAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtLike(String value) {
            addCriterion("USE_AMT like", value, "useAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtNotLike(String value) {
            addCriterion("USE_AMT not like", value, "useAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtIn(List<String> values) {
            addCriterion("USE_AMT in", values, "useAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtNotIn(List<String> values) {
            addCriterion("USE_AMT not in", values, "useAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtBetween(String value1, String value2) {
            addCriterion("USE_AMT between", value1, value2, "useAmt");
            return (Criteria) this;
        }

        public Criteria andUseAmtNotBetween(String value1, String value2) {
            addCriterion("USE_AMT not between", value1, value2, "useAmt");
            return (Criteria) this;
        }

        public Criteria andMainKeyIsNull() {
            addCriterion("MAIN_KEY is null");
            return (Criteria) this;
        }

        public Criteria andMainKeyIsNotNull() {
            addCriterion("MAIN_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andMainKeyEqualTo(String value) {
            addCriterion("MAIN_KEY =", value, "mainKey");
            return (Criteria) this;
        }

        public Criteria andMainKeyNotEqualTo(String value) {
            addCriterion("MAIN_KEY <>", value, "mainKey");
            return (Criteria) this;
        }

        public Criteria andMainKeyGreaterThan(String value) {
            addCriterion("MAIN_KEY >", value, "mainKey");
            return (Criteria) this;
        }

        public Criteria andMainKeyGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_KEY >=", value, "mainKey");
            return (Criteria) this;
        }

        public Criteria andMainKeyLessThan(String value) {
            addCriterion("MAIN_KEY <", value, "mainKey");
            return (Criteria) this;
        }

        public Criteria andMainKeyLessThanOrEqualTo(String value) {
            addCriterion("MAIN_KEY <=", value, "mainKey");
            return (Criteria) this;
        }

        public Criteria andMainKeyLike(String value) {
            addCriterion("MAIN_KEY like", value, "mainKey");
            return (Criteria) this;
        }

        public Criteria andMainKeyNotLike(String value) {
            addCriterion("MAIN_KEY not like", value, "mainKey");
            return (Criteria) this;
        }

        public Criteria andMainKeyIn(List<String> values) {
            addCriterion("MAIN_KEY in", values, "mainKey");
            return (Criteria) this;
        }

        public Criteria andMainKeyNotIn(List<String> values) {
            addCriterion("MAIN_KEY not in", values, "mainKey");
            return (Criteria) this;
        }

        public Criteria andMainKeyBetween(String value1, String value2) {
            addCriterion("MAIN_KEY between", value1, value2, "mainKey");
            return (Criteria) this;
        }

        public Criteria andMainKeyNotBetween(String value1, String value2) {
            addCriterion("MAIN_KEY not between", value1, value2, "mainKey");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andResv1IsNull() {
            addCriterion("RESV1 is null");
            return (Criteria) this;
        }

        public Criteria andResv1IsNotNull() {
            addCriterion("RESV1 is not null");
            return (Criteria) this;
        }

        public Criteria andResv1EqualTo(String value) {
            addCriterion("RESV1 =", value, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv1NotEqualTo(String value) {
            addCriterion("RESV1 <>", value, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv1GreaterThan(String value) {
            addCriterion("RESV1 >", value, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv1GreaterThanOrEqualTo(String value) {
            addCriterion("RESV1 >=", value, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv1LessThan(String value) {
            addCriterion("RESV1 <", value, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv1LessThanOrEqualTo(String value) {
            addCriterion("RESV1 <=", value, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv1Like(String value) {
            addCriterion("RESV1 like", value, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv1NotLike(String value) {
            addCriterion("RESV1 not like", value, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv1In(List<String> values) {
            addCriterion("RESV1 in", values, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv1NotIn(List<String> values) {
            addCriterion("RESV1 not in", values, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv1Between(String value1, String value2) {
            addCriterion("RESV1 between", value1, value2, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv1NotBetween(String value1, String value2) {
            addCriterion("RESV1 not between", value1, value2, "resv1");
            return (Criteria) this;
        }

        public Criteria andResv2IsNull() {
            addCriterion("RESV2 is null");
            return (Criteria) this;
        }

        public Criteria andResv2IsNotNull() {
            addCriterion("RESV2 is not null");
            return (Criteria) this;
        }

        public Criteria andResv2EqualTo(String value) {
            addCriterion("RESV2 =", value, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv2NotEqualTo(String value) {
            addCriterion("RESV2 <>", value, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv2GreaterThan(String value) {
            addCriterion("RESV2 >", value, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv2GreaterThanOrEqualTo(String value) {
            addCriterion("RESV2 >=", value, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv2LessThan(String value) {
            addCriterion("RESV2 <", value, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv2LessThanOrEqualTo(String value) {
            addCriterion("RESV2 <=", value, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv2Like(String value) {
            addCriterion("RESV2 like", value, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv2NotLike(String value) {
            addCriterion("RESV2 not like", value, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv2In(List<String> values) {
            addCriterion("RESV2 in", values, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv2NotIn(List<String> values) {
            addCriterion("RESV2 not in", values, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv2Between(String value1, String value2) {
            addCriterion("RESV2 between", value1, value2, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv2NotBetween(String value1, String value2) {
            addCriterion("RESV2 not between", value1, value2, "resv2");
            return (Criteria) this;
        }

        public Criteria andResv3IsNull() {
            addCriterion("RESV3 is null");
            return (Criteria) this;
        }

        public Criteria andResv3IsNotNull() {
            addCriterion("RESV3 is not null");
            return (Criteria) this;
        }

        public Criteria andResv3EqualTo(String value) {
            addCriterion("RESV3 =", value, "resv3");
            return (Criteria) this;
        }

        public Criteria andResv3NotEqualTo(String value) {
            addCriterion("RESV3 <>", value, "resv3");
            return (Criteria) this;
        }

        public Criteria andResv3GreaterThan(String value) {
            addCriterion("RESV3 >", value, "resv3");
            return (Criteria) this;
        }

        public Criteria andResv3GreaterThanOrEqualTo(String value) {
            addCriterion("RESV3 >=", value, "resv3");
            return (Criteria) this;
        }

        public Criteria andResv3LessThan(String value) {
            addCriterion("RESV3 <", value, "resv3");
            return (Criteria) this;
        }

        public Criteria andResv3LessThanOrEqualTo(String value) {
            addCriterion("RESV3 <=", value, "resv3");
            return (Criteria) this;
        }

        public Criteria andResv3Like(String value) {
            addCriterion("RESV3 like", value, "resv3");
            return (Criteria) this;
        }

        public Criteria andResv3NotLike(String value) {
            addCriterion("RESV3 not like", value, "resv3");
            return (Criteria) this;
        }

        public Criteria andResv3In(List<String> values) {
            addCriterion("RESV3 in", values, "resv3");
            return (Criteria) this;
        }

        public Criteria andResv3NotIn(List<String> values) {
            addCriterion("RESV3 not in", values, "resv3");
            return (Criteria) this;
        }

        public Criteria andResv3Between(String value1, String value2) {
            addCriterion("RESV3 between", value1, value2, "resv3");
            return (Criteria) this;
        }

        public Criteria andResv3NotBetween(String value1, String value2) {
            addCriterion("RESV3 not between", value1, value2, "resv3");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_BANK_WECHAT_INFO
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
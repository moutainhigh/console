package com.allcheer.bpos.entity;

import java.util.ArrayList;
import java.util.List;

public class TblMerBankInfoDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_MER_BANK_INFO
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_MER_BANK_INFO
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_MER_BANK_INFO
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MER_BANK_INFO
     *
     * @mbggenerated
     */
    public TblMerBankInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MER_BANK_INFO
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MER_BANK_INFO
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MER_BANK_INFO
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MER_BANK_INFO
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MER_BANK_INFO
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MER_BANK_INFO
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MER_BANK_INFO
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
     * This method corresponds to the database table TBL_MER_BANK_INFO
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
     * This method corresponds to the database table TBL_MER_BANK_INFO
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_MER_BANK_INFO
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
     * This class corresponds to the database table TBL_MER_BANK_INFO
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

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNull() {
            addCriterion("PROV_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNotNull() {
            addCriterion("PROV_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvNameEqualTo(String value) {
            addCriterion("PROV_NAME =", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotEqualTo(String value) {
            addCriterion("PROV_NAME <>", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThan(String value) {
            addCriterion("PROV_NAME >", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROV_NAME >=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThan(String value) {
            addCriterion("PROV_NAME <", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThanOrEqualTo(String value) {
            addCriterion("PROV_NAME <=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLike(String value) {
            addCriterion("PROV_NAME like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotLike(String value) {
            addCriterion("PROV_NAME not like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameIn(List<String> values) {
            addCriterion("PROV_NAME in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotIn(List<String> values) {
            addCriterion("PROV_NAME not in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameBetween(String value1, String value2) {
            addCriterion("PROV_NAME between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotBetween(String value1, String value2) {
            addCriterion("PROV_NAME not between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("CITY_NAME =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("CITY_NAME <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("CITY_NAME >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("CITY_NAME <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("CITY_NAME like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("CITY_NAME not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("CITY_NAME in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("CITY_NAME not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("CITY_NAME between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCnapsIsNull() {
            addCriterion("CNAPS is null");
            return (Criteria) this;
        }

        public Criteria andCnapsIsNotNull() {
            addCriterion("CNAPS is not null");
            return (Criteria) this;
        }

        public Criteria andCnapsEqualTo(String value) {
            addCriterion("CNAPS =", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotEqualTo(String value) {
            addCriterion("CNAPS <>", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsGreaterThan(String value) {
            addCriterion("CNAPS >", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsGreaterThanOrEqualTo(String value) {
            addCriterion("CNAPS >=", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsLessThan(String value) {
            addCriterion("CNAPS <", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsLessThanOrEqualTo(String value) {
            addCriterion("CNAPS <=", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsLike(String value) {
            addCriterion("CNAPS like", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotLike(String value) {
            addCriterion("CNAPS not like", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsIn(List<String> values) {
            addCriterion("CNAPS in", values, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotIn(List<String> values) {
            addCriterion("CNAPS not in", values, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsBetween(String value1, String value2) {
            addCriterion("CNAPS between", value1, value2, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotBetween(String value1, String value2) {
            addCriterion("CNAPS not between", value1, value2, "cnaps");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameIsNull() {
            addCriterion("BANK_BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameIsNotNull() {
            addCriterion("BANK_BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME =", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameNotEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME <>", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameGreaterThan(String value) {
            addCriterion("BANK_BRANCH_NAME >", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME >=", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameLessThan(String value) {
            addCriterion("BANK_BRANCH_NAME <", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME <=", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameLike(String value) {
            addCriterion("BANK_BRANCH_NAME like", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameNotLike(String value) {
            addCriterion("BANK_BRANCH_NAME not like", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameIn(List<String> values) {
            addCriterion("BANK_BRANCH_NAME in", values, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameNotIn(List<String> values) {
            addCriterion("BANK_BRANCH_NAME not in", values, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameBetween(String value1, String value2) {
            addCriterion("BANK_BRANCH_NAME between", value1, value2, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameNotBetween(String value1, String value2) {
            addCriterion("BANK_BRANCH_NAME not between", value1, value2, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIsNull() {
            addCriterion("IS_PRIVATE is null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIsNotNull() {
            addCriterion("IS_PRIVATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateEqualTo(String value) {
            addCriterion("IS_PRIVATE =", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotEqualTo(String value) {
            addCriterion("IS_PRIVATE <>", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateGreaterThan(String value) {
            addCriterion("IS_PRIVATE >", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PRIVATE >=", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateLessThan(String value) {
            addCriterion("IS_PRIVATE <", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateLessThanOrEqualTo(String value) {
            addCriterion("IS_PRIVATE <=", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateLike(String value) {
            addCriterion("IS_PRIVATE like", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotLike(String value) {
            addCriterion("IS_PRIVATE not like", value, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateIn(List<String> values) {
            addCriterion("IS_PRIVATE in", values, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotIn(List<String> values) {
            addCriterion("IS_PRIVATE not in", values, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateBetween(String value1, String value2) {
            addCriterion("IS_PRIVATE between", value1, value2, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andIsPrivateNotBetween(String value1, String value2) {
            addCriterion("IS_PRIVATE not between", value1, value2, "isPrivate");
            return (Criteria) this;
        }

        public Criteria andAcctNameIsNull() {
            addCriterion("ACCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAcctNameIsNotNull() {
            addCriterion("ACCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNameEqualTo(String value) {
            addCriterion("ACCT_NAME =", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotEqualTo(String value) {
            addCriterion("ACCT_NAME <>", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameGreaterThan(String value) {
            addCriterion("ACCT_NAME >", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_NAME >=", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLessThan(String value) {
            addCriterion("ACCT_NAME <", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLessThanOrEqualTo(String value) {
            addCriterion("ACCT_NAME <=", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLike(String value) {
            addCriterion("ACCT_NAME like", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotLike(String value) {
            addCriterion("ACCT_NAME not like", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameIn(List<String> values) {
            addCriterion("ACCT_NAME in", values, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotIn(List<String> values) {
            addCriterion("ACCT_NAME not in", values, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameBetween(String value1, String value2) {
            addCriterion("ACCT_NAME between", value1, value2, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotBetween(String value1, String value2) {
            addCriterion("ACCT_NAME not between", value1, value2, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNoIsNull() {
            addCriterion("ACCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andAcctNoIsNotNull() {
            addCriterion("ACCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNoEqualTo(String value) {
            addCriterion("ACCT_NO =", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotEqualTo(String value) {
            addCriterion("ACCT_NO <>", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoGreaterThan(String value) {
            addCriterion("ACCT_NO >", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_NO >=", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLessThan(String value) {
            addCriterion("ACCT_NO <", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLessThanOrEqualTo(String value) {
            addCriterion("ACCT_NO <=", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLike(String value) {
            addCriterion("ACCT_NO like", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotLike(String value) {
            addCriterion("ACCT_NO not like", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoIn(List<String> values) {
            addCriterion("ACCT_NO in", values, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotIn(List<String> values) {
            addCriterion("ACCT_NO not in", values, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoBetween(String value1, String value2) {
            addCriterion("ACCT_NO between", value1, value2, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotBetween(String value1, String value2) {
            addCriterion("ACCT_NO not between", value1, value2, "acctNo");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_MER_BANK_INFO
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
     * This class corresponds to the database table TBL_MER_BANK_INFO
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
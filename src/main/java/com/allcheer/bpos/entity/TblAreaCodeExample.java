package com.allcheer.bpos.entity;

import java.util.ArrayList;
import java.util.List;

public class TblAreaCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblAreaCodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("AREA_NAME =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("AREA_NAME <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("AREA_NAME >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NAME >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("AREA_NAME <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("AREA_NAME <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("AREA_NAME like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("AREA_NAME not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("AREA_NAME in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("AREA_NAME not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("AREA_NAME between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("AREA_NAME not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeIsNull() {
            addCriterion("UP_AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeIsNotNull() {
            addCriterion("UP_AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeEqualTo(String value) {
            addCriterion("UP_AREA_CODE =", value, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeNotEqualTo(String value) {
            addCriterion("UP_AREA_CODE <>", value, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeGreaterThan(String value) {
            addCriterion("UP_AREA_CODE >", value, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UP_AREA_CODE >=", value, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeLessThan(String value) {
            addCriterion("UP_AREA_CODE <", value, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("UP_AREA_CODE <=", value, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeLike(String value) {
            addCriterion("UP_AREA_CODE like", value, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeNotLike(String value) {
            addCriterion("UP_AREA_CODE not like", value, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeIn(List<String> values) {
            addCriterion("UP_AREA_CODE in", values, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeNotIn(List<String> values) {
            addCriterion("UP_AREA_CODE not in", values, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeBetween(String value1, String value2) {
            addCriterion("UP_AREA_CODE between", value1, value2, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andUpAreaCodeNotBetween(String value1, String value2) {
            addCriterion("UP_AREA_CODE not between", value1, value2, "upAreaCode");
            return (Criteria) this;
        }

        public Criteria andAreaTypeIsNull() {
            addCriterion("AREA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAreaTypeIsNotNull() {
            addCriterion("AREA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaTypeEqualTo(String value) {
            addCriterion("AREA_TYPE =", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeNotEqualTo(String value) {
            addCriterion("AREA_TYPE <>", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeGreaterThan(String value) {
            addCriterion("AREA_TYPE >", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_TYPE >=", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeLessThan(String value) {
            addCriterion("AREA_TYPE <", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeLessThanOrEqualTo(String value) {
            addCriterion("AREA_TYPE <=", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeLike(String value) {
            addCriterion("AREA_TYPE like", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeNotLike(String value) {
            addCriterion("AREA_TYPE not like", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeIn(List<String> values) {
            addCriterion("AREA_TYPE in", values, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeNotIn(List<String> values) {
            addCriterion("AREA_TYPE not in", values, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeBetween(String value1, String value2) {
            addCriterion("AREA_TYPE between", value1, value2, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeNotBetween(String value1, String value2) {
            addCriterion("AREA_TYPE not between", value1, value2, "areaType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
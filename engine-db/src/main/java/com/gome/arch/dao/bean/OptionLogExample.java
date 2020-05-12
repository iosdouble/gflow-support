package com.gome.arch.dao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OptionLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OptionLogExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLogLevelIsNull() {
            addCriterion("log_level is null");
            return (Criteria) this;
        }

        public Criteria andLogLevelIsNotNull() {
            addCriterion("log_level is not null");
            return (Criteria) this;
        }

        public Criteria andLogLevelEqualTo(String value) {
            addCriterion("log_level =", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotEqualTo(String value) {
            addCriterion("log_level <>", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelGreaterThan(String value) {
            addCriterion("log_level >", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelGreaterThanOrEqualTo(String value) {
            addCriterion("log_level >=", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLessThan(String value) {
            addCriterion("log_level <", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLessThanOrEqualTo(String value) {
            addCriterion("log_level <=", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLike(String value) {
            addCriterion("log_level like", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotLike(String value) {
            addCriterion("log_level not like", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelIn(List<String> values) {
            addCriterion("log_level in", values, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotIn(List<String> values) {
            addCriterion("log_level not in", values, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelBetween(String value1, String value2) {
            addCriterion("log_level between", value1, value2, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotBetween(String value1, String value2) {
            addCriterion("log_level not between", value1, value2, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeIsNull() {
            addCriterion("log_create_time is null");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeIsNotNull() {
            addCriterion("log_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeEqualTo(Date value) {
            addCriterion("log_create_time =", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeNotEqualTo(Date value) {
            addCriterion("log_create_time <>", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeGreaterThan(Date value) {
            addCriterion("log_create_time >", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_create_time >=", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeLessThan(Date value) {
            addCriterion("log_create_time <", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("log_create_time <=", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeIn(List<Date> values) {
            addCriterion("log_create_time in", values, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeNotIn(List<Date> values) {
            addCriterion("log_create_time not in", values, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeBetween(Date value1, Date value2) {
            addCriterion("log_create_time between", value1, value2, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("log_create_time not between", value1, value2, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemIsNull() {
            addCriterion("last_updatetiem is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemIsNotNull() {
            addCriterion("last_updatetiem is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemEqualTo(Date value) {
            addCriterion("last_updatetiem =", value, "lastUpdatetiem");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemNotEqualTo(Date value) {
            addCriterion("last_updatetiem <>", value, "lastUpdatetiem");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemGreaterThan(Date value) {
            addCriterion("last_updatetiem >", value, "lastUpdatetiem");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemGreaterThanOrEqualTo(Date value) {
            addCriterion("last_updatetiem >=", value, "lastUpdatetiem");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemLessThan(Date value) {
            addCriterion("last_updatetiem <", value, "lastUpdatetiem");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemLessThanOrEqualTo(Date value) {
            addCriterion("last_updatetiem <=", value, "lastUpdatetiem");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemIn(List<Date> values) {
            addCriterion("last_updatetiem in", values, "lastUpdatetiem");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemNotIn(List<Date> values) {
            addCriterion("last_updatetiem not in", values, "lastUpdatetiem");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemBetween(Date value1, Date value2) {
            addCriterion("last_updatetiem between", value1, value2, "lastUpdatetiem");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetiemNotBetween(Date value1, Date value2) {
            addCriterion("last_updatetiem not between", value1, value2, "lastUpdatetiem");
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
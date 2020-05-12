package com.gome.arch.dao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseApplyOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseApplyOrderExample() {
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

        public Criteria andApplyOrderDetailIdIsNull() {
            addCriterion("apply_order_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyOrderDetailIdIsNotNull() {
            addCriterion("apply_order_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyOrderDetailIdEqualTo(Long value) {
            addCriterion("apply_order_detail_id =", value, "applyOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderDetailIdNotEqualTo(Long value) {
            addCriterion("apply_order_detail_id <>", value, "applyOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderDetailIdGreaterThan(Long value) {
            addCriterion("apply_order_detail_id >", value, "applyOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_order_detail_id >=", value, "applyOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderDetailIdLessThan(Long value) {
            addCriterion("apply_order_detail_id <", value, "applyOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("apply_order_detail_id <=", value, "applyOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderDetailIdIn(List<Long> values) {
            addCriterion("apply_order_detail_id in", values, "applyOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderDetailIdNotIn(List<Long> values) {
            addCriterion("apply_order_detail_id not in", values, "applyOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderDetailIdBetween(Long value1, Long value2) {
            addCriterion("apply_order_detail_id between", value1, value2, "applyOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("apply_order_detail_id not between", value1, value2, "applyOrderDetailId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeIsNull() {
            addCriterion("apply_user_code is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeIsNotNull() {
            addCriterion("apply_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeEqualTo(Long value) {
            addCriterion("apply_user_code =", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeNotEqualTo(Long value) {
            addCriterion("apply_user_code <>", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeGreaterThan(Long value) {
            addCriterion("apply_user_code >", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_user_code >=", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeLessThan(Long value) {
            addCriterion("apply_user_code <", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeLessThanOrEqualTo(Long value) {
            addCriterion("apply_user_code <=", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeIn(List<Long> values) {
            addCriterion("apply_user_code in", values, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeNotIn(List<Long> values) {
            addCriterion("apply_user_code not in", values, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeBetween(Long value1, Long value2) {
            addCriterion("apply_user_code between", value1, value2, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeNotBetween(Long value1, Long value2) {
            addCriterion("apply_user_code not between", value1, value2, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNull() {
            addCriterion("system_type is null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNotNull() {
            addCriterion("system_type is not null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeEqualTo(String value) {
            addCriterion("system_type =", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotEqualTo(String value) {
            addCriterion("system_type <>", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThan(String value) {
            addCriterion("system_type >", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("system_type >=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThan(String value) {
            addCriterion("system_type <", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThanOrEqualTo(String value) {
            addCriterion("system_type <=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLike(String value) {
            addCriterion("system_type like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotLike(String value) {
            addCriterion("system_type not like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIn(List<String> values) {
            addCriterion("system_type in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotIn(List<String> values) {
            addCriterion("system_type not in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeBetween(String value1, String value2) {
            addCriterion("system_type between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotBetween(String value1, String value2) {
            addCriterion("system_type not between", value1, value2, "systemType");
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
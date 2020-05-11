package com.gome.arch.dao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RtApprovalDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RtApprovalDetailExample() {
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

        public Criteria andCurrentNodeDealIdIsNull() {
            addCriterion("current_node_deal_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeDealIdIsNotNull() {
            addCriterion("current_node_deal_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeDealIdEqualTo(Long value) {
            addCriterion("current_node_deal_id =", value, "currentNodeDealId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeDealIdNotEqualTo(Long value) {
            addCriterion("current_node_deal_id <>", value, "currentNodeDealId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeDealIdGreaterThan(Long value) {
            addCriterion("current_node_deal_id >", value, "currentNodeDealId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeDealIdGreaterThanOrEqualTo(Long value) {
            addCriterion("current_node_deal_id >=", value, "currentNodeDealId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeDealIdLessThan(Long value) {
            addCriterion("current_node_deal_id <", value, "currentNodeDealId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeDealIdLessThanOrEqualTo(Long value) {
            addCriterion("current_node_deal_id <=", value, "currentNodeDealId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeDealIdIn(List<Long> values) {
            addCriterion("current_node_deal_id in", values, "currentNodeDealId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeDealIdNotIn(List<Long> values) {
            addCriterion("current_node_deal_id not in", values, "currentNodeDealId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeDealIdBetween(Long value1, Long value2) {
            addCriterion("current_node_deal_id between", value1, value2, "currentNodeDealId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeDealIdNotBetween(Long value1, Long value2) {
            addCriterion("current_node_deal_id not between", value1, value2, "currentNodeDealId");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdIsNull() {
            addCriterion("current_process_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdIsNotNull() {
            addCriterion("current_process_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdEqualTo(Integer value) {
            addCriterion("current_process_id =", value, "currentProcessId");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdNotEqualTo(Integer value) {
            addCriterion("current_process_id <>", value, "currentProcessId");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdGreaterThan(Integer value) {
            addCriterion("current_process_id >", value, "currentProcessId");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_process_id >=", value, "currentProcessId");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdLessThan(Integer value) {
            addCriterion("current_process_id <", value, "currentProcessId");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdLessThanOrEqualTo(Integer value) {
            addCriterion("current_process_id <=", value, "currentProcessId");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdIn(List<Integer> values) {
            addCriterion("current_process_id in", values, "currentProcessId");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdNotIn(List<Integer> values) {
            addCriterion("current_process_id not in", values, "currentProcessId");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdBetween(Integer value1, Integer value2) {
            addCriterion("current_process_id between", value1, value2, "currentProcessId");
            return (Criteria) this;
        }

        public Criteria andCurrentProcessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("current_process_id not between", value1, value2, "currentProcessId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdIsNull() {
            addCriterion("apply_order_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdIsNotNull() {
            addCriterion("apply_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdEqualTo(Long value) {
            addCriterion("apply_order_id =", value, "applyOrderId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdNotEqualTo(Long value) {
            addCriterion("apply_order_id <>", value, "applyOrderId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdGreaterThan(Long value) {
            addCriterion("apply_order_id >", value, "applyOrderId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_order_id >=", value, "applyOrderId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdLessThan(Long value) {
            addCriterion("apply_order_id <", value, "applyOrderId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("apply_order_id <=", value, "applyOrderId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdIn(List<Long> values) {
            addCriterion("apply_order_id in", values, "applyOrderId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdNotIn(List<Long> values) {
            addCriterion("apply_order_id not in", values, "applyOrderId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdBetween(Long value1, Long value2) {
            addCriterion("apply_order_id between", value1, value2, "applyOrderId");
            return (Criteria) this;
        }

        public Criteria andApplyOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("apply_order_id not between", value1, value2, "applyOrderId");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdIsNull() {
            addCriterion("approval_person_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdIsNotNull() {
            addCriterion("approval_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdEqualTo(Long value) {
            addCriterion("approval_person_id =", value, "approvalPersonId");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdNotEqualTo(Long value) {
            addCriterion("approval_person_id <>", value, "approvalPersonId");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdGreaterThan(Long value) {
            addCriterion("approval_person_id >", value, "approvalPersonId");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("approval_person_id >=", value, "approvalPersonId");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdLessThan(Long value) {
            addCriterion("approval_person_id <", value, "approvalPersonId");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdLessThanOrEqualTo(Long value) {
            addCriterion("approval_person_id <=", value, "approvalPersonId");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdIn(List<Long> values) {
            addCriterion("approval_person_id in", values, "approvalPersonId");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdNotIn(List<Long> values) {
            addCriterion("approval_person_id not in", values, "approvalPersonId");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdBetween(Long value1, Long value2) {
            addCriterion("approval_person_id between", value1, value2, "approvalPersonId");
            return (Criteria) this;
        }

        public Criteria andApprovalPersonIdNotBetween(Long value1, Long value2) {
            addCriterion("approval_person_id not between", value1, value2, "approvalPersonId");
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

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
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
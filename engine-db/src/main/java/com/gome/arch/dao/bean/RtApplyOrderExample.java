package com.gome.arch.dao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RtApplyOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RtApplyOrderExample() {
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

        public Criteria andCurrentNodeIdIsNull() {
            addCriterion("current_node_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIdIsNotNull() {
            addCriterion("current_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIdEqualTo(Long value) {
            addCriterion("current_node_id =", value, "currentNodeId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIdNotEqualTo(Long value) {
            addCriterion("current_node_id <>", value, "currentNodeId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIdGreaterThan(Long value) {
            addCriterion("current_node_id >", value, "currentNodeId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("current_node_id >=", value, "currentNodeId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIdLessThan(Long value) {
            addCriterion("current_node_id <", value, "currentNodeId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("current_node_id <=", value, "currentNodeId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIdIn(List<Long> values) {
            addCriterion("current_node_id in", values, "currentNodeId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIdNotIn(List<Long> values) {
            addCriterion("current_node_id not in", values, "currentNodeId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIdBetween(Long value1, Long value2) {
            addCriterion("current_node_id between", value1, value2, "currentNodeId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("current_node_id not between", value1, value2, "currentNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIsNull() {
            addCriterion("next_node_id is null");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIsNotNull() {
            addCriterion("next_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdEqualTo(Long value) {
            addCriterion("next_node_id =", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotEqualTo(Long value) {
            addCriterion("next_node_id <>", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdGreaterThan(Long value) {
            addCriterion("next_node_id >", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("next_node_id >=", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdLessThan(Long value) {
            addCriterion("next_node_id <", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("next_node_id <=", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIn(List<Long> values) {
            addCriterion("next_node_id in", values, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotIn(List<Long> values) {
            addCriterion("next_node_id not in", values, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdBetween(Long value1, Long value2) {
            addCriterion("next_node_id between", value1, value2, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("next_node_id not between", value1, value2, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusIsNull() {
            addCriterion("current_node_finish_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusIsNotNull() {
            addCriterion("current_node_finish_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusEqualTo(Integer value) {
            addCriterion("current_node_finish_status =", value, "currentNodeFinishStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusNotEqualTo(Integer value) {
            addCriterion("current_node_finish_status <>", value, "currentNodeFinishStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusGreaterThan(Integer value) {
            addCriterion("current_node_finish_status >", value, "currentNodeFinishStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_node_finish_status >=", value, "currentNodeFinishStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusLessThan(Integer value) {
            addCriterion("current_node_finish_status <", value, "currentNodeFinishStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusLessThanOrEqualTo(Integer value) {
            addCriterion("current_node_finish_status <=", value, "currentNodeFinishStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusIn(List<Integer> values) {
            addCriterion("current_node_finish_status in", values, "currentNodeFinishStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusNotIn(List<Integer> values) {
            addCriterion("current_node_finish_status not in", values, "currentNodeFinishStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusBetween(Integer value1, Integer value2) {
            addCriterion("current_node_finish_status between", value1, value2, "currentNodeFinishStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentNodeFinishStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("current_node_finish_status not between", value1, value2, "currentNodeFinishStatus");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusIsNull() {
            addCriterion("process_finish_status is null");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusIsNotNull() {
            addCriterion("process_finish_status is not null");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusEqualTo(Integer value) {
            addCriterion("process_finish_status =", value, "processFinishStatus");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusNotEqualTo(Integer value) {
            addCriterion("process_finish_status <>", value, "processFinishStatus");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusGreaterThan(Integer value) {
            addCriterion("process_finish_status >", value, "processFinishStatus");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_finish_status >=", value, "processFinishStatus");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusLessThan(Integer value) {
            addCriterion("process_finish_status <", value, "processFinishStatus");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusLessThanOrEqualTo(Integer value) {
            addCriterion("process_finish_status <=", value, "processFinishStatus");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusIn(List<Integer> values) {
            addCriterion("process_finish_status in", values, "processFinishStatus");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusNotIn(List<Integer> values) {
            addCriterion("process_finish_status not in", values, "processFinishStatus");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusBetween(Integer value1, Integer value2) {
            addCriterion("process_finish_status between", value1, value2, "processFinishStatus");
            return (Criteria) this;
        }

        public Criteria andProcessFinishStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("process_finish_status not between", value1, value2, "processFinishStatus");
            return (Criteria) this;
        }

        public Criteria andPorcessIdIsNull() {
            addCriterion("porcess_id is null");
            return (Criteria) this;
        }

        public Criteria andPorcessIdIsNotNull() {
            addCriterion("porcess_id is not null");
            return (Criteria) this;
        }

        public Criteria andPorcessIdEqualTo(Integer value) {
            addCriterion("porcess_id =", value, "porcessId");
            return (Criteria) this;
        }

        public Criteria andPorcessIdNotEqualTo(Integer value) {
            addCriterion("porcess_id <>", value, "porcessId");
            return (Criteria) this;
        }

        public Criteria andPorcessIdGreaterThan(Integer value) {
            addCriterion("porcess_id >", value, "porcessId");
            return (Criteria) this;
        }

        public Criteria andPorcessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("porcess_id >=", value, "porcessId");
            return (Criteria) this;
        }

        public Criteria andPorcessIdLessThan(Integer value) {
            addCriterion("porcess_id <", value, "porcessId");
            return (Criteria) this;
        }

        public Criteria andPorcessIdLessThanOrEqualTo(Integer value) {
            addCriterion("porcess_id <=", value, "porcessId");
            return (Criteria) this;
        }

        public Criteria andPorcessIdIn(List<Integer> values) {
            addCriterion("porcess_id in", values, "porcessId");
            return (Criteria) this;
        }

        public Criteria andPorcessIdNotIn(List<Integer> values) {
            addCriterion("porcess_id not in", values, "porcessId");
            return (Criteria) this;
        }

        public Criteria andPorcessIdBetween(Integer value1, Integer value2) {
            addCriterion("porcess_id between", value1, value2, "porcessId");
            return (Criteria) this;
        }

        public Criteria andPorcessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("porcess_id not between", value1, value2, "porcessId");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberIsNull() {
            addCriterion("process_node_totalnumber is null");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberIsNotNull() {
            addCriterion("process_node_totalnumber is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberEqualTo(Long value) {
            addCriterion("process_node_totalnumber =", value, "processNodeTotalnumber");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberNotEqualTo(Long value) {
            addCriterion("process_node_totalnumber <>", value, "processNodeTotalnumber");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberGreaterThan(Long value) {
            addCriterion("process_node_totalnumber >", value, "processNodeTotalnumber");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node_totalnumber >=", value, "processNodeTotalnumber");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberLessThan(Long value) {
            addCriterion("process_node_totalnumber <", value, "processNodeTotalnumber");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberLessThanOrEqualTo(Long value) {
            addCriterion("process_node_totalnumber <=", value, "processNodeTotalnumber");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberIn(List<Long> values) {
            addCriterion("process_node_totalnumber in", values, "processNodeTotalnumber");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberNotIn(List<Long> values) {
            addCriterion("process_node_totalnumber not in", values, "processNodeTotalnumber");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberBetween(Long value1, Long value2) {
            addCriterion("process_node_totalnumber between", value1, value2, "processNodeTotalnumber");
            return (Criteria) this;
        }

        public Criteria andProcessNodeTotalnumberNotBetween(Long value1, Long value2) {
            addCriterion("process_node_totalnumber not between", value1, value2, "processNodeTotalnumber");
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
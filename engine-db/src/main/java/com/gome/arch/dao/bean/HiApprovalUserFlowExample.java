package com.gome.arch.dao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiApprovalUserFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HiApprovalUserFlowExample() {
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

        public Criteria andSubmitterIdIsNull() {
            addCriterion("submitter_id is null");
            return (Criteria) this;
        }

        public Criteria andSubmitterIdIsNotNull() {
            addCriterion("submitter_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitterIdEqualTo(Long value) {
            addCriterion("submitter_id =", value, "submitterId");
            return (Criteria) this;
        }

        public Criteria andSubmitterIdNotEqualTo(Long value) {
            addCriterion("submitter_id <>", value, "submitterId");
            return (Criteria) this;
        }

        public Criteria andSubmitterIdGreaterThan(Long value) {
            addCriterion("submitter_id >", value, "submitterId");
            return (Criteria) this;
        }

        public Criteria andSubmitterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("submitter_id >=", value, "submitterId");
            return (Criteria) this;
        }

        public Criteria andSubmitterIdLessThan(Long value) {
            addCriterion("submitter_id <", value, "submitterId");
            return (Criteria) this;
        }

        public Criteria andSubmitterIdLessThanOrEqualTo(Long value) {
            addCriterion("submitter_id <=", value, "submitterId");
            return (Criteria) this;
        }

        public Criteria andSubmitterIdIn(List<Long> values) {
            addCriterion("submitter_id in", values, "submitterId");
            return (Criteria) this;
        }

        public Criteria andSubmitterIdNotIn(List<Long> values) {
            addCriterion("submitter_id not in", values, "submitterId");
            return (Criteria) this;
        }

        public Criteria andSubmitterIdBetween(Long value1, Long value2) {
            addCriterion("submitter_id between", value1, value2, "submitterId");
            return (Criteria) this;
        }

        public Criteria andSubmitterIdNotBetween(Long value1, Long value2) {
            addCriterion("submitter_id not between", value1, value2, "submitterId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(Integer value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(Integer value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(Integer value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(Integer value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(Integer value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<Integer> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<Integer> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(Integer value1, Integer value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNull() {
            addCriterion("node_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(Long value) {
            addCriterion("node_id =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(Long value) {
            addCriterion("node_id <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(Long value) {
            addCriterion("node_id >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("node_id >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(Long value) {
            addCriterion("node_id <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("node_id <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<Long> values) {
            addCriterion("node_id in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<Long> values) {
            addCriterion("node_id not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(Long value1, Long value2) {
            addCriterion("node_id between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("node_id not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdIsNull() {
            addCriterion("approval_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdIsNotNull() {
            addCriterion("approval_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdEqualTo(Long value) {
            addCriterion("approval_user_id =", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdNotEqualTo(Long value) {
            addCriterion("approval_user_id <>", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdGreaterThan(Long value) {
            addCriterion("approval_user_id >", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("approval_user_id >=", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdLessThan(Long value) {
            addCriterion("approval_user_id <", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdLessThanOrEqualTo(Long value) {
            addCriterion("approval_user_id <=", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdIn(List<Long> values) {
            addCriterion("approval_user_id in", values, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdNotIn(List<Long> values) {
            addCriterion("approval_user_id not in", values, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdBetween(Long value1, Long value2) {
            addCriterion("approval_user_id between", value1, value2, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdNotBetween(Long value1, Long value2) {
            addCriterion("approval_user_id not between", value1, value2, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andNodeOrderIsNull() {
            addCriterion("node_order is null");
            return (Criteria) this;
        }

        public Criteria andNodeOrderIsNotNull() {
            addCriterion("node_order is not null");
            return (Criteria) this;
        }

        public Criteria andNodeOrderEqualTo(Integer value) {
            addCriterion("node_order =", value, "nodeOrder");
            return (Criteria) this;
        }

        public Criteria andNodeOrderNotEqualTo(Integer value) {
            addCriterion("node_order <>", value, "nodeOrder");
            return (Criteria) this;
        }

        public Criteria andNodeOrderGreaterThan(Integer value) {
            addCriterion("node_order >", value, "nodeOrder");
            return (Criteria) this;
        }

        public Criteria andNodeOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_order >=", value, "nodeOrder");
            return (Criteria) this;
        }

        public Criteria andNodeOrderLessThan(Integer value) {
            addCriterion("node_order <", value, "nodeOrder");
            return (Criteria) this;
        }

        public Criteria andNodeOrderLessThanOrEqualTo(Integer value) {
            addCriterion("node_order <=", value, "nodeOrder");
            return (Criteria) this;
        }

        public Criteria andNodeOrderIn(List<Integer> values) {
            addCriterion("node_order in", values, "nodeOrder");
            return (Criteria) this;
        }

        public Criteria andNodeOrderNotIn(List<Integer> values) {
            addCriterion("node_order not in", values, "nodeOrder");
            return (Criteria) this;
        }

        public Criteria andNodeOrderBetween(Integer value1, Integer value2) {
            addCriterion("node_order between", value1, value2, "nodeOrder");
            return (Criteria) this;
        }

        public Criteria andNodeOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("node_order not between", value1, value2, "nodeOrder");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountIsNull() {
            addCriterion("apply_user_domain_dccount is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountIsNotNull() {
            addCriterion("apply_user_domain_dccount is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountEqualTo(String value) {
            addCriterion("apply_user_domain_dccount =", value, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountNotEqualTo(String value) {
            addCriterion("apply_user_domain_dccount <>", value, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountGreaterThan(String value) {
            addCriterion("apply_user_domain_dccount >", value, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user_domain_dccount >=", value, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountLessThan(String value) {
            addCriterion("apply_user_domain_dccount <", value, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountLessThanOrEqualTo(String value) {
            addCriterion("apply_user_domain_dccount <=", value, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountLike(String value) {
            addCriterion("apply_user_domain_dccount like", value, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountNotLike(String value) {
            addCriterion("apply_user_domain_dccount not like", value, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountIn(List<String> values) {
            addCriterion("apply_user_domain_dccount in", values, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountNotIn(List<String> values) {
            addCriterion("apply_user_domain_dccount not in", values, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountBetween(String value1, String value2) {
            addCriterion("apply_user_domain_dccount between", value1, value2, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserDomainDccountNotBetween(String value1, String value2) {
            addCriterion("apply_user_domain_dccount not between", value1, value2, "applyUserDomainDccount");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailIsNull() {
            addCriterion("apply_user_email is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailIsNotNull() {
            addCriterion("apply_user_email is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailEqualTo(String value) {
            addCriterion("apply_user_email =", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailNotEqualTo(String value) {
            addCriterion("apply_user_email <>", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailGreaterThan(String value) {
            addCriterion("apply_user_email >", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user_email >=", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailLessThan(String value) {
            addCriterion("apply_user_email <", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailLessThanOrEqualTo(String value) {
            addCriterion("apply_user_email <=", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailLike(String value) {
            addCriterion("apply_user_email like", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailNotLike(String value) {
            addCriterion("apply_user_email not like", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailIn(List<String> values) {
            addCriterion("apply_user_email in", values, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailNotIn(List<String> values) {
            addCriterion("apply_user_email not in", values, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailBetween(String value1, String value2) {
            addCriterion("apply_user_email between", value1, value2, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailNotBetween(String value1, String value2) {
            addCriterion("apply_user_email not between", value1, value2, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApprovalStateIsNull() {
            addCriterion("approval_state is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStateIsNotNull() {
            addCriterion("approval_state is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStateEqualTo(Integer value) {
            addCriterion("approval_state =", value, "approvalState");
            return (Criteria) this;
        }

        public Criteria andApprovalStateNotEqualTo(Integer value) {
            addCriterion("approval_state <>", value, "approvalState");
            return (Criteria) this;
        }

        public Criteria andApprovalStateGreaterThan(Integer value) {
            addCriterion("approval_state >", value, "approvalState");
            return (Criteria) this;
        }

        public Criteria andApprovalStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_state >=", value, "approvalState");
            return (Criteria) this;
        }

        public Criteria andApprovalStateLessThan(Integer value) {
            addCriterion("approval_state <", value, "approvalState");
            return (Criteria) this;
        }

        public Criteria andApprovalStateLessThanOrEqualTo(Integer value) {
            addCriterion("approval_state <=", value, "approvalState");
            return (Criteria) this;
        }

        public Criteria andApprovalStateIn(List<Integer> values) {
            addCriterion("approval_state in", values, "approvalState");
            return (Criteria) this;
        }

        public Criteria andApprovalStateNotIn(List<Integer> values) {
            addCriterion("approval_state not in", values, "approvalState");
            return (Criteria) this;
        }

        public Criteria andApprovalStateBetween(Integer value1, Integer value2) {
            addCriterion("approval_state between", value1, value2, "approvalState");
            return (Criteria) this;
        }

        public Criteria andApprovalStateNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_state not between", value1, value2, "approvalState");
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
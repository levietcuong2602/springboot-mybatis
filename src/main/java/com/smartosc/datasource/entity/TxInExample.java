package com.smartosc.datasource.entity;

import java.util.ArrayList;
import java.util.List;

public class TxInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TxInExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andTxInIdIsNull() {
            addCriterion("tx_in_id is null");
            return (Criteria) this;
        }

        public Criteria andTxInIdIsNotNull() {
            addCriterion("tx_in_id is not null");
            return (Criteria) this;
        }

        public Criteria andTxInIdEqualTo(Long value) {
            addCriterion("tx_in_id =", value, "txInId");
            return (Criteria) this;
        }

        public Criteria andTxInIdNotEqualTo(Long value) {
            addCriterion("tx_in_id <>", value, "txInId");
            return (Criteria) this;
        }

        public Criteria andTxInIdGreaterThan(Long value) {
            addCriterion("tx_in_id >", value, "txInId");
            return (Criteria) this;
        }

        public Criteria andTxInIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tx_in_id >=", value, "txInId");
            return (Criteria) this;
        }

        public Criteria andTxInIdLessThan(Long value) {
            addCriterion("tx_in_id <", value, "txInId");
            return (Criteria) this;
        }

        public Criteria andTxInIdLessThanOrEqualTo(Long value) {
            addCriterion("tx_in_id <=", value, "txInId");
            return (Criteria) this;
        }

        public Criteria andTxInIdIn(List<Long> values) {
            addCriterion("tx_in_id in", values, "txInId");
            return (Criteria) this;
        }

        public Criteria andTxInIdNotIn(List<Long> values) {
            addCriterion("tx_in_id not in", values, "txInId");
            return (Criteria) this;
        }

        public Criteria andTxInIdBetween(Long value1, Long value2) {
            addCriterion("tx_in_id between", value1, value2, "txInId");
            return (Criteria) this;
        }

        public Criteria andTxInIdNotBetween(Long value1, Long value2) {
            addCriterion("tx_in_id not between", value1, value2, "txInId");
            return (Criteria) this;
        }

        public Criteria andTxOutIdIsNull() {
            addCriterion("tx_out_id is null");
            return (Criteria) this;
        }

        public Criteria andTxOutIdIsNotNull() {
            addCriterion("tx_out_id is not null");
            return (Criteria) this;
        }

        public Criteria andTxOutIdEqualTo(Long value) {
            addCriterion("tx_out_id =", value, "txOutId");
            return (Criteria) this;
        }

        public Criteria andTxOutIdNotEqualTo(Long value) {
            addCriterion("tx_out_id <>", value, "txOutId");
            return (Criteria) this;
        }

        public Criteria andTxOutIdGreaterThan(Long value) {
            addCriterion("tx_out_id >", value, "txOutId");
            return (Criteria) this;
        }

        public Criteria andTxOutIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tx_out_id >=", value, "txOutId");
            return (Criteria) this;
        }

        public Criteria andTxOutIdLessThan(Long value) {
            addCriterion("tx_out_id <", value, "txOutId");
            return (Criteria) this;
        }

        public Criteria andTxOutIdLessThanOrEqualTo(Long value) {
            addCriterion("tx_out_id <=", value, "txOutId");
            return (Criteria) this;
        }

        public Criteria andTxOutIdIn(List<Long> values) {
            addCriterion("tx_out_id in", values, "txOutId");
            return (Criteria) this;
        }

        public Criteria andTxOutIdNotIn(List<Long> values) {
            addCriterion("tx_out_id not in", values, "txOutId");
            return (Criteria) this;
        }

        public Criteria andTxOutIdBetween(Long value1, Long value2) {
            addCriterion("tx_out_id between", value1, value2, "txOutId");
            return (Criteria) this;
        }

        public Criteria andTxOutIdNotBetween(Long value1, Long value2) {
            addCriterion("tx_out_id not between", value1, value2, "txOutId");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexIsNull() {
            addCriterion("tx_out_index is null");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexIsNotNull() {
            addCriterion("tx_out_index is not null");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexEqualTo(Object value) {
            addCriterion("tx_out_index =", value, "txOutIndex");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexNotEqualTo(Object value) {
            addCriterion("tx_out_index <>", value, "txOutIndex");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexGreaterThan(Object value) {
            addCriterion("tx_out_index >", value, "txOutIndex");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexGreaterThanOrEqualTo(Object value) {
            addCriterion("tx_out_index >=", value, "txOutIndex");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexLessThan(Object value) {
            addCriterion("tx_out_index <", value, "txOutIndex");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexLessThanOrEqualTo(Object value) {
            addCriterion("tx_out_index <=", value, "txOutIndex");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexIn(List<Object> values) {
            addCriterion("tx_out_index in", values, "txOutIndex");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexNotIn(List<Object> values) {
            addCriterion("tx_out_index not in", values, "txOutIndex");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexBetween(Object value1, Object value2) {
            addCriterion("tx_out_index between", value1, value2, "txOutIndex");
            return (Criteria) this;
        }

        public Criteria andTxOutIndexNotBetween(Object value1, Object value2) {
            addCriterion("tx_out_index not between", value1, value2, "txOutIndex");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdIsNull() {
            addCriterion("redeemer_id is null");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdIsNotNull() {
            addCriterion("redeemer_id is not null");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdEqualTo(Long value) {
            addCriterion("redeemer_id =", value, "redeemerId");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdNotEqualTo(Long value) {
            addCriterion("redeemer_id <>", value, "redeemerId");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdGreaterThan(Long value) {
            addCriterion("redeemer_id >", value, "redeemerId");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("redeemer_id >=", value, "redeemerId");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdLessThan(Long value) {
            addCriterion("redeemer_id <", value, "redeemerId");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdLessThanOrEqualTo(Long value) {
            addCriterion("redeemer_id <=", value, "redeemerId");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdIn(List<Long> values) {
            addCriterion("redeemer_id in", values, "redeemerId");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdNotIn(List<Long> values) {
            addCriterion("redeemer_id not in", values, "redeemerId");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdBetween(Long value1, Long value2) {
            addCriterion("redeemer_id between", value1, value2, "redeemerId");
            return (Criteria) this;
        }

        public Criteria andRedeemerIdNotBetween(Long value1, Long value2) {
            addCriterion("redeemer_id not between", value1, value2, "redeemerId");
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
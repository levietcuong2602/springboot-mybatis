package com.smartosc.datasource.entity;

import java.util.ArrayList;
import java.util.List;

public class TxOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TxOutExample() {
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

        public Criteria andTxIdIsNull() {
            addCriterion("tx_id is null");
            return (Criteria) this;
        }

        public Criteria andTxIdIsNotNull() {
            addCriterion("tx_id is not null");
            return (Criteria) this;
        }

        public Criteria andTxIdEqualTo(Long value) {
            addCriterion("tx_id =", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdNotEqualTo(Long value) {
            addCriterion("tx_id <>", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdGreaterThan(Long value) {
            addCriterion("tx_id >", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tx_id >=", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdLessThan(Long value) {
            addCriterion("tx_id <", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdLessThanOrEqualTo(Long value) {
            addCriterion("tx_id <=", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdIn(List<Long> values) {
            addCriterion("tx_id in", values, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdNotIn(List<Long> values) {
            addCriterion("tx_id not in", values, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdBetween(Long value1, Long value2) {
            addCriterion("tx_id between", value1, value2, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdNotBetween(Long value1, Long value2) {
            addCriterion("tx_id not between", value1, value2, "txId");
            return (Criteria) this;
        }

        public Criteria andIndexIsNull() {
            addCriterion("index is null");
            return (Criteria) this;
        }

        public Criteria andIndexIsNotNull() {
            addCriterion("index is not null");
            return (Criteria) this;
        }

        public Criteria andIndexEqualTo(Object value) {
            addCriterion("index =", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotEqualTo(Object value) {
            addCriterion("index <>", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThan(Object value) {
            addCriterion("index >", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThanOrEqualTo(Object value) {
            addCriterion("index >=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThan(Object value) {
            addCriterion("index <", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThanOrEqualTo(Object value) {
            addCriterion("index <=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexIn(List<Object> values) {
            addCriterion("index in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotIn(List<Object> values) {
            addCriterion("index not in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexBetween(Object value1, Object value2) {
            addCriterion("index between", value1, value2, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotBetween(Object value1, Object value2) {
            addCriterion("index not between", value1, value2, "index");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptIsNull() {
            addCriterion("address_has_script is null");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptIsNotNull() {
            addCriterion("address_has_script is not null");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptEqualTo(Boolean value) {
            addCriterion("address_has_script =", value, "addressHasScript");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptNotEqualTo(Boolean value) {
            addCriterion("address_has_script <>", value, "addressHasScript");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptGreaterThan(Boolean value) {
            addCriterion("address_has_script >", value, "addressHasScript");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptGreaterThanOrEqualTo(Boolean value) {
            addCriterion("address_has_script >=", value, "addressHasScript");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptLessThan(Boolean value) {
            addCriterion("address_has_script <", value, "addressHasScript");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptLessThanOrEqualTo(Boolean value) {
            addCriterion("address_has_script <=", value, "addressHasScript");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptIn(List<Boolean> values) {
            addCriterion("address_has_script in", values, "addressHasScript");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptNotIn(List<Boolean> values) {
            addCriterion("address_has_script not in", values, "addressHasScript");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptBetween(Boolean value1, Boolean value2) {
            addCriterion("address_has_script between", value1, value2, "addressHasScript");
            return (Criteria) this;
        }

        public Criteria andAddressHasScriptNotBetween(Boolean value1, Boolean value2) {
            addCriterion("address_has_script not between", value1, value2, "addressHasScript");
            return (Criteria) this;
        }

        public Criteria andPaymentCredIsNull() {
            addCriterion("payment_cred is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCredIsNotNull() {
            addCriterion("payment_cred is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCredEqualTo(Object value) {
            addCriterion("payment_cred =", value, "paymentCred");
            return (Criteria) this;
        }

        public Criteria andPaymentCredNotEqualTo(Object value) {
            addCriterion("payment_cred <>", value, "paymentCred");
            return (Criteria) this;
        }

        public Criteria andPaymentCredGreaterThan(Object value) {
            addCriterion("payment_cred >", value, "paymentCred");
            return (Criteria) this;
        }

        public Criteria andPaymentCredGreaterThanOrEqualTo(Object value) {
            addCriterion("payment_cred >=", value, "paymentCred");
            return (Criteria) this;
        }

        public Criteria andPaymentCredLessThan(Object value) {
            addCriterion("payment_cred <", value, "paymentCred");
            return (Criteria) this;
        }

        public Criteria andPaymentCredLessThanOrEqualTo(Object value) {
            addCriterion("payment_cred <=", value, "paymentCred");
            return (Criteria) this;
        }

        public Criteria andPaymentCredIn(List<Object> values) {
            addCriterion("payment_cred in", values, "paymentCred");
            return (Criteria) this;
        }

        public Criteria andPaymentCredNotIn(List<Object> values) {
            addCriterion("payment_cred not in", values, "paymentCred");
            return (Criteria) this;
        }

        public Criteria andPaymentCredBetween(Object value1, Object value2) {
            addCriterion("payment_cred between", value1, value2, "paymentCred");
            return (Criteria) this;
        }

        public Criteria andPaymentCredNotBetween(Object value1, Object value2) {
            addCriterion("payment_cred not between", value1, value2, "paymentCred");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdIsNull() {
            addCriterion("stake_address_id is null");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdIsNotNull() {
            addCriterion("stake_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdEqualTo(Long value) {
            addCriterion("stake_address_id =", value, "stakeAddressId");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdNotEqualTo(Long value) {
            addCriterion("stake_address_id <>", value, "stakeAddressId");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdGreaterThan(Long value) {
            addCriterion("stake_address_id >", value, "stakeAddressId");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdGreaterThanOrEqualTo(Long value) {
            addCriterion("stake_address_id >=", value, "stakeAddressId");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdLessThan(Long value) {
            addCriterion("stake_address_id <", value, "stakeAddressId");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdLessThanOrEqualTo(Long value) {
            addCriterion("stake_address_id <=", value, "stakeAddressId");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdIn(List<Long> values) {
            addCriterion("stake_address_id in", values, "stakeAddressId");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdNotIn(List<Long> values) {
            addCriterion("stake_address_id not in", values, "stakeAddressId");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdBetween(Long value1, Long value2) {
            addCriterion("stake_address_id between", value1, value2, "stakeAddressId");
            return (Criteria) this;
        }

        public Criteria andStakeAddressIdNotBetween(Long value1, Long value2) {
            addCriterion("stake_address_id not between", value1, value2, "stakeAddressId");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Object value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Object value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Object value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Object value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Object value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Object value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Object> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Object> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Object value1, Object value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Object value1, Object value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andDataHashIsNull() {
            addCriterion("data_hash is null");
            return (Criteria) this;
        }

        public Criteria andDataHashIsNotNull() {
            addCriterion("data_hash is not null");
            return (Criteria) this;
        }

        public Criteria andDataHashEqualTo(Object value) {
            addCriterion("data_hash =", value, "dataHash");
            return (Criteria) this;
        }

        public Criteria andDataHashNotEqualTo(Object value) {
            addCriterion("data_hash <>", value, "dataHash");
            return (Criteria) this;
        }

        public Criteria andDataHashGreaterThan(Object value) {
            addCriterion("data_hash >", value, "dataHash");
            return (Criteria) this;
        }

        public Criteria andDataHashGreaterThanOrEqualTo(Object value) {
            addCriterion("data_hash >=", value, "dataHash");
            return (Criteria) this;
        }

        public Criteria andDataHashLessThan(Object value) {
            addCriterion("data_hash <", value, "dataHash");
            return (Criteria) this;
        }

        public Criteria andDataHashLessThanOrEqualTo(Object value) {
            addCriterion("data_hash <=", value, "dataHash");
            return (Criteria) this;
        }

        public Criteria andDataHashIn(List<Object> values) {
            addCriterion("data_hash in", values, "dataHash");
            return (Criteria) this;
        }

        public Criteria andDataHashNotIn(List<Object> values) {
            addCriterion("data_hash not in", values, "dataHash");
            return (Criteria) this;
        }

        public Criteria andDataHashBetween(Object value1, Object value2) {
            addCriterion("data_hash between", value1, value2, "dataHash");
            return (Criteria) this;
        }

        public Criteria andDataHashNotBetween(Object value1, Object value2) {
            addCriterion("data_hash not between", value1, value2, "dataHash");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdIsNull() {
            addCriterion("inline_datum_id is null");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdIsNotNull() {
            addCriterion("inline_datum_id is not null");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdEqualTo(Long value) {
            addCriterion("inline_datum_id =", value, "inlineDatumId");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdNotEqualTo(Long value) {
            addCriterion("inline_datum_id <>", value, "inlineDatumId");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdGreaterThan(Long value) {
            addCriterion("inline_datum_id >", value, "inlineDatumId");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inline_datum_id >=", value, "inlineDatumId");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdLessThan(Long value) {
            addCriterion("inline_datum_id <", value, "inlineDatumId");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdLessThanOrEqualTo(Long value) {
            addCriterion("inline_datum_id <=", value, "inlineDatumId");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdIn(List<Long> values) {
            addCriterion("inline_datum_id in", values, "inlineDatumId");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdNotIn(List<Long> values) {
            addCriterion("inline_datum_id not in", values, "inlineDatumId");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdBetween(Long value1, Long value2) {
            addCriterion("inline_datum_id between", value1, value2, "inlineDatumId");
            return (Criteria) this;
        }

        public Criteria andInlineDatumIdNotBetween(Long value1, Long value2) {
            addCriterion("inline_datum_id not between", value1, value2, "inlineDatumId");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdIsNull() {
            addCriterion("reference_script_id is null");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdIsNotNull() {
            addCriterion("reference_script_id is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdEqualTo(Long value) {
            addCriterion("reference_script_id =", value, "referenceScriptId");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdNotEqualTo(Long value) {
            addCriterion("reference_script_id <>", value, "referenceScriptId");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdGreaterThan(Long value) {
            addCriterion("reference_script_id >", value, "referenceScriptId");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reference_script_id >=", value, "referenceScriptId");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdLessThan(Long value) {
            addCriterion("reference_script_id <", value, "referenceScriptId");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdLessThanOrEqualTo(Long value) {
            addCriterion("reference_script_id <=", value, "referenceScriptId");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdIn(List<Long> values) {
            addCriterion("reference_script_id in", values, "referenceScriptId");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdNotIn(List<Long> values) {
            addCriterion("reference_script_id not in", values, "referenceScriptId");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdBetween(Long value1, Long value2) {
            addCriterion("reference_script_id between", value1, value2, "referenceScriptId");
            return (Criteria) this;
        }

        public Criteria andReferenceScriptIdNotBetween(Long value1, Long value2) {
            addCriterion("reference_script_id not between", value1, value2, "referenceScriptId");
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
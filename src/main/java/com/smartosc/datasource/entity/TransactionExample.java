package com.smartosc.datasource.entity;

import java.util.ArrayList;
import java.util.List;

public class TransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionExample() {
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

        public Criteria andHashIsNull() {
            addCriterion("hash is null");
            return (Criteria) this;
        }

        public Criteria andHashIsNotNull() {
            addCriterion("hash is not null");
            return (Criteria) this;
        }

        public Criteria andHashEqualTo(Object value) {
            addCriterion("hash =", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotEqualTo(Object value) {
            addCriterion("hash <>", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashGreaterThan(Object value) {
            addCriterion("hash >", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashGreaterThanOrEqualTo(Object value) {
            addCriterion("hash >=", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashLessThan(Object value) {
            addCriterion("hash <", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashLessThanOrEqualTo(Object value) {
            addCriterion("hash <=", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashIn(List<Object> values) {
            addCriterion("hash in", values, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotIn(List<Object> values) {
            addCriterion("hash not in", values, "hash");
            return (Criteria) this;
        }

        public Criteria andHashBetween(Object value1, Object value2) {
            addCriterion("hash between", value1, value2, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotBetween(Object value1, Object value2) {
            addCriterion("hash not between", value1, value2, "hash");
            return (Criteria) this;
        }

        public Criteria andBlockIdIsNull() {
            addCriterion("block_id is null");
            return (Criteria) this;
        }

        public Criteria andBlockIdIsNotNull() {
            addCriterion("block_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlockIdEqualTo(Long value) {
            addCriterion("block_id =", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdNotEqualTo(Long value) {
            addCriterion("block_id <>", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdGreaterThan(Long value) {
            addCriterion("block_id >", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdGreaterThanOrEqualTo(Long value) {
            addCriterion("block_id >=", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdLessThan(Long value) {
            addCriterion("block_id <", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdLessThanOrEqualTo(Long value) {
            addCriterion("block_id <=", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdIn(List<Long> values) {
            addCriterion("block_id in", values, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdNotIn(List<Long> values) {
            addCriterion("block_id not in", values, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdBetween(Long value1, Long value2) {
            addCriterion("block_id between", value1, value2, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdNotBetween(Long value1, Long value2) {
            addCriterion("block_id not between", value1, value2, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIndexIsNull() {
            addCriterion("block_index is null");
            return (Criteria) this;
        }

        public Criteria andBlockIndexIsNotNull() {
            addCriterion("block_index is not null");
            return (Criteria) this;
        }

        public Criteria andBlockIndexEqualTo(Object value) {
            addCriterion("block_index =", value, "blockIndex");
            return (Criteria) this;
        }

        public Criteria andBlockIndexNotEqualTo(Object value) {
            addCriterion("block_index <>", value, "blockIndex");
            return (Criteria) this;
        }

        public Criteria andBlockIndexGreaterThan(Object value) {
            addCriterion("block_index >", value, "blockIndex");
            return (Criteria) this;
        }

        public Criteria andBlockIndexGreaterThanOrEqualTo(Object value) {
            addCriterion("block_index >=", value, "blockIndex");
            return (Criteria) this;
        }

        public Criteria andBlockIndexLessThan(Object value) {
            addCriterion("block_index <", value, "blockIndex");
            return (Criteria) this;
        }

        public Criteria andBlockIndexLessThanOrEqualTo(Object value) {
            addCriterion("block_index <=", value, "blockIndex");
            return (Criteria) this;
        }

        public Criteria andBlockIndexIn(List<Object> values) {
            addCriterion("block_index in", values, "blockIndex");
            return (Criteria) this;
        }

        public Criteria andBlockIndexNotIn(List<Object> values) {
            addCriterion("block_index not in", values, "blockIndex");
            return (Criteria) this;
        }

        public Criteria andBlockIndexBetween(Object value1, Object value2) {
            addCriterion("block_index between", value1, value2, "blockIndex");
            return (Criteria) this;
        }

        public Criteria andBlockIndexNotBetween(Object value1, Object value2) {
            addCriterion("block_index not between", value1, value2, "blockIndex");
            return (Criteria) this;
        }

        public Criteria andOutSumIsNull() {
            addCriterion("out_sum is null");
            return (Criteria) this;
        }

        public Criteria andOutSumIsNotNull() {
            addCriterion("out_sum is not null");
            return (Criteria) this;
        }

        public Criteria andOutSumEqualTo(Object value) {
            addCriterion("out_sum =", value, "outSum");
            return (Criteria) this;
        }

        public Criteria andOutSumNotEqualTo(Object value) {
            addCriterion("out_sum <>", value, "outSum");
            return (Criteria) this;
        }

        public Criteria andOutSumGreaterThan(Object value) {
            addCriterion("out_sum >", value, "outSum");
            return (Criteria) this;
        }

        public Criteria andOutSumGreaterThanOrEqualTo(Object value) {
            addCriterion("out_sum >=", value, "outSum");
            return (Criteria) this;
        }

        public Criteria andOutSumLessThan(Object value) {
            addCriterion("out_sum <", value, "outSum");
            return (Criteria) this;
        }

        public Criteria andOutSumLessThanOrEqualTo(Object value) {
            addCriterion("out_sum <=", value, "outSum");
            return (Criteria) this;
        }

        public Criteria andOutSumIn(List<Object> values) {
            addCriterion("out_sum in", values, "outSum");
            return (Criteria) this;
        }

        public Criteria andOutSumNotIn(List<Object> values) {
            addCriterion("out_sum not in", values, "outSum");
            return (Criteria) this;
        }

        public Criteria andOutSumBetween(Object value1, Object value2) {
            addCriterion("out_sum between", value1, value2, "outSum");
            return (Criteria) this;
        }

        public Criteria andOutSumNotBetween(Object value1, Object value2) {
            addCriterion("out_sum not between", value1, value2, "outSum");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(Object value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(Object value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(Object value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(Object value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(Object value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(Object value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<Object> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<Object> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(Object value1, Object value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(Object value1, Object value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Long value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Long value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Long value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Long value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Long value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Long value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Long> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Long> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Long value1, Long value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Long value1, Long value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Object value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Object value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Object value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Object value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Object value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Object value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Object> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Object> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Object value1, Object value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Object value1, Object value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeIsNull() {
            addCriterion("invalid_before is null");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeIsNotNull() {
            addCriterion("invalid_before is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeEqualTo(Object value) {
            addCriterion("invalid_before =", value, "invalidBefore");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeNotEqualTo(Object value) {
            addCriterion("invalid_before <>", value, "invalidBefore");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeGreaterThan(Object value) {
            addCriterion("invalid_before >", value, "invalidBefore");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeGreaterThanOrEqualTo(Object value) {
            addCriterion("invalid_before >=", value, "invalidBefore");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeLessThan(Object value) {
            addCriterion("invalid_before <", value, "invalidBefore");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeLessThanOrEqualTo(Object value) {
            addCriterion("invalid_before <=", value, "invalidBefore");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeIn(List<Object> values) {
            addCriterion("invalid_before in", values, "invalidBefore");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeNotIn(List<Object> values) {
            addCriterion("invalid_before not in", values, "invalidBefore");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeBetween(Object value1, Object value2) {
            addCriterion("invalid_before between", value1, value2, "invalidBefore");
            return (Criteria) this;
        }

        public Criteria andInvalidBeforeNotBetween(Object value1, Object value2) {
            addCriterion("invalid_before not between", value1, value2, "invalidBefore");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterIsNull() {
            addCriterion("invalid_hereafter is null");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterIsNotNull() {
            addCriterion("invalid_hereafter is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterEqualTo(Object value) {
            addCriterion("invalid_hereafter =", value, "invalidHereafter");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterNotEqualTo(Object value) {
            addCriterion("invalid_hereafter <>", value, "invalidHereafter");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterGreaterThan(Object value) {
            addCriterion("invalid_hereafter >", value, "invalidHereafter");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterGreaterThanOrEqualTo(Object value) {
            addCriterion("invalid_hereafter >=", value, "invalidHereafter");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterLessThan(Object value) {
            addCriterion("invalid_hereafter <", value, "invalidHereafter");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterLessThanOrEqualTo(Object value) {
            addCriterion("invalid_hereafter <=", value, "invalidHereafter");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterIn(List<Object> values) {
            addCriterion("invalid_hereafter in", values, "invalidHereafter");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterNotIn(List<Object> values) {
            addCriterion("invalid_hereafter not in", values, "invalidHereafter");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterBetween(Object value1, Object value2) {
            addCriterion("invalid_hereafter between", value1, value2, "invalidHereafter");
            return (Criteria) this;
        }

        public Criteria andInvalidHereafterNotBetween(Object value1, Object value2) {
            addCriterion("invalid_hereafter not between", value1, value2, "invalidHereafter");
            return (Criteria) this;
        }

        public Criteria andValidContractIsNull() {
            addCriterion("valid_contract is null");
            return (Criteria) this;
        }

        public Criteria andValidContractIsNotNull() {
            addCriterion("valid_contract is not null");
            return (Criteria) this;
        }

        public Criteria andValidContractEqualTo(Boolean value) {
            addCriterion("valid_contract =", value, "validContract");
            return (Criteria) this;
        }

        public Criteria andValidContractNotEqualTo(Boolean value) {
            addCriterion("valid_contract <>", value, "validContract");
            return (Criteria) this;
        }

        public Criteria andValidContractGreaterThan(Boolean value) {
            addCriterion("valid_contract >", value, "validContract");
            return (Criteria) this;
        }

        public Criteria andValidContractGreaterThanOrEqualTo(Boolean value) {
            addCriterion("valid_contract >=", value, "validContract");
            return (Criteria) this;
        }

        public Criteria andValidContractLessThan(Boolean value) {
            addCriterion("valid_contract <", value, "validContract");
            return (Criteria) this;
        }

        public Criteria andValidContractLessThanOrEqualTo(Boolean value) {
            addCriterion("valid_contract <=", value, "validContract");
            return (Criteria) this;
        }

        public Criteria andValidContractIn(List<Boolean> values) {
            addCriterion("valid_contract in", values, "validContract");
            return (Criteria) this;
        }

        public Criteria andValidContractNotIn(List<Boolean> values) {
            addCriterion("valid_contract not in", values, "validContract");
            return (Criteria) this;
        }

        public Criteria andValidContractBetween(Boolean value1, Boolean value2) {
            addCriterion("valid_contract between", value1, value2, "validContract");
            return (Criteria) this;
        }

        public Criteria andValidContractNotBetween(Boolean value1, Boolean value2) {
            addCriterion("valid_contract not between", value1, value2, "validContract");
            return (Criteria) this;
        }

        public Criteria andScriptSizeIsNull() {
            addCriterion("script_size is null");
            return (Criteria) this;
        }

        public Criteria andScriptSizeIsNotNull() {
            addCriterion("script_size is not null");
            return (Criteria) this;
        }

        public Criteria andScriptSizeEqualTo(Object value) {
            addCriterion("script_size =", value, "scriptSize");
            return (Criteria) this;
        }

        public Criteria andScriptSizeNotEqualTo(Object value) {
            addCriterion("script_size <>", value, "scriptSize");
            return (Criteria) this;
        }

        public Criteria andScriptSizeGreaterThan(Object value) {
            addCriterion("script_size >", value, "scriptSize");
            return (Criteria) this;
        }

        public Criteria andScriptSizeGreaterThanOrEqualTo(Object value) {
            addCriterion("script_size >=", value, "scriptSize");
            return (Criteria) this;
        }

        public Criteria andScriptSizeLessThan(Object value) {
            addCriterion("script_size <", value, "scriptSize");
            return (Criteria) this;
        }

        public Criteria andScriptSizeLessThanOrEqualTo(Object value) {
            addCriterion("script_size <=", value, "scriptSize");
            return (Criteria) this;
        }

        public Criteria andScriptSizeIn(List<Object> values) {
            addCriterion("script_size in", values, "scriptSize");
            return (Criteria) this;
        }

        public Criteria andScriptSizeNotIn(List<Object> values) {
            addCriterion("script_size not in", values, "scriptSize");
            return (Criteria) this;
        }

        public Criteria andScriptSizeBetween(Object value1, Object value2) {
            addCriterion("script_size between", value1, value2, "scriptSize");
            return (Criteria) this;
        }

        public Criteria andScriptSizeNotBetween(Object value1, Object value2) {
            addCriterion("script_size not between", value1, value2, "scriptSize");
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
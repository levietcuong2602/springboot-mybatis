package com.smartosc.datasource.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlockExample() {
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

        public Criteria andEpochNoIsNull() {
            addCriterion("epoch_no is null");
            return (Criteria) this;
        }

        public Criteria andEpochNoIsNotNull() {
            addCriterion("epoch_no is not null");
            return (Criteria) this;
        }

        public Criteria andEpochNoEqualTo(Object value) {
            addCriterion("epoch_no =", value, "epochNo");
            return (Criteria) this;
        }

        public Criteria andEpochNoNotEqualTo(Object value) {
            addCriterion("epoch_no <>", value, "epochNo");
            return (Criteria) this;
        }

        public Criteria andEpochNoGreaterThan(Object value) {
            addCriterion("epoch_no >", value, "epochNo");
            return (Criteria) this;
        }

        public Criteria andEpochNoGreaterThanOrEqualTo(Object value) {
            addCriterion("epoch_no >=", value, "epochNo");
            return (Criteria) this;
        }

        public Criteria andEpochNoLessThan(Object value) {
            addCriterion("epoch_no <", value, "epochNo");
            return (Criteria) this;
        }

        public Criteria andEpochNoLessThanOrEqualTo(Object value) {
            addCriterion("epoch_no <=", value, "epochNo");
            return (Criteria) this;
        }

        public Criteria andEpochNoIn(List<Object> values) {
            addCriterion("epoch_no in", values, "epochNo");
            return (Criteria) this;
        }

        public Criteria andEpochNoNotIn(List<Object> values) {
            addCriterion("epoch_no not in", values, "epochNo");
            return (Criteria) this;
        }

        public Criteria andEpochNoBetween(Object value1, Object value2) {
            addCriterion("epoch_no between", value1, value2, "epochNo");
            return (Criteria) this;
        }

        public Criteria andEpochNoNotBetween(Object value1, Object value2) {
            addCriterion("epoch_no not between", value1, value2, "epochNo");
            return (Criteria) this;
        }

        public Criteria andSlotNoIsNull() {
            addCriterion("slot_no is null");
            return (Criteria) this;
        }

        public Criteria andSlotNoIsNotNull() {
            addCriterion("slot_no is not null");
            return (Criteria) this;
        }

        public Criteria andSlotNoEqualTo(Object value) {
            addCriterion("slot_no =", value, "slotNo");
            return (Criteria) this;
        }

        public Criteria andSlotNoNotEqualTo(Object value) {
            addCriterion("slot_no <>", value, "slotNo");
            return (Criteria) this;
        }

        public Criteria andSlotNoGreaterThan(Object value) {
            addCriterion("slot_no >", value, "slotNo");
            return (Criteria) this;
        }

        public Criteria andSlotNoGreaterThanOrEqualTo(Object value) {
            addCriterion("slot_no >=", value, "slotNo");
            return (Criteria) this;
        }

        public Criteria andSlotNoLessThan(Object value) {
            addCriterion("slot_no <", value, "slotNo");
            return (Criteria) this;
        }

        public Criteria andSlotNoLessThanOrEqualTo(Object value) {
            addCriterion("slot_no <=", value, "slotNo");
            return (Criteria) this;
        }

        public Criteria andSlotNoIn(List<Object> values) {
            addCriterion("slot_no in", values, "slotNo");
            return (Criteria) this;
        }

        public Criteria andSlotNoNotIn(List<Object> values) {
            addCriterion("slot_no not in", values, "slotNo");
            return (Criteria) this;
        }

        public Criteria andSlotNoBetween(Object value1, Object value2) {
            addCriterion("slot_no between", value1, value2, "slotNo");
            return (Criteria) this;
        }

        public Criteria andSlotNoNotBetween(Object value1, Object value2) {
            addCriterion("slot_no not between", value1, value2, "slotNo");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoIsNull() {
            addCriterion("epoch_slot_no is null");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoIsNotNull() {
            addCriterion("epoch_slot_no is not null");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoEqualTo(Object value) {
            addCriterion("epoch_slot_no =", value, "epochSlotNo");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoNotEqualTo(Object value) {
            addCriterion("epoch_slot_no <>", value, "epochSlotNo");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoGreaterThan(Object value) {
            addCriterion("epoch_slot_no >", value, "epochSlotNo");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoGreaterThanOrEqualTo(Object value) {
            addCriterion("epoch_slot_no >=", value, "epochSlotNo");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoLessThan(Object value) {
            addCriterion("epoch_slot_no <", value, "epochSlotNo");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoLessThanOrEqualTo(Object value) {
            addCriterion("epoch_slot_no <=", value, "epochSlotNo");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoIn(List<Object> values) {
            addCriterion("epoch_slot_no in", values, "epochSlotNo");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoNotIn(List<Object> values) {
            addCriterion("epoch_slot_no not in", values, "epochSlotNo");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoBetween(Object value1, Object value2) {
            addCriterion("epoch_slot_no between", value1, value2, "epochSlotNo");
            return (Criteria) this;
        }

        public Criteria andEpochSlotNoNotBetween(Object value1, Object value2) {
            addCriterion("epoch_slot_no not between", value1, value2, "epochSlotNo");
            return (Criteria) this;
        }

        public Criteria andBlockNoIsNull() {
            addCriterion("block_no is null");
            return (Criteria) this;
        }

        public Criteria andBlockNoIsNotNull() {
            addCriterion("block_no is not null");
            return (Criteria) this;
        }

        public Criteria andBlockNoEqualTo(Object value) {
            addCriterion("block_no =", value, "blockNo");
            return (Criteria) this;
        }

        public Criteria andBlockNoNotEqualTo(Object value) {
            addCriterion("block_no <>", value, "blockNo");
            return (Criteria) this;
        }

        public Criteria andBlockNoGreaterThan(Object value) {
            addCriterion("block_no >", value, "blockNo");
            return (Criteria) this;
        }

        public Criteria andBlockNoGreaterThanOrEqualTo(Object value) {
            addCriterion("block_no >=", value, "blockNo");
            return (Criteria) this;
        }

        public Criteria andBlockNoLessThan(Object value) {
            addCriterion("block_no <", value, "blockNo");
            return (Criteria) this;
        }

        public Criteria andBlockNoLessThanOrEqualTo(Object value) {
            addCriterion("block_no <=", value, "blockNo");
            return (Criteria) this;
        }

        public Criteria andBlockNoIn(List<Object> values) {
            addCriterion("block_no in", values, "blockNo");
            return (Criteria) this;
        }

        public Criteria andBlockNoNotIn(List<Object> values) {
            addCriterion("block_no not in", values, "blockNo");
            return (Criteria) this;
        }

        public Criteria andBlockNoBetween(Object value1, Object value2) {
            addCriterion("block_no between", value1, value2, "blockNo");
            return (Criteria) this;
        }

        public Criteria andBlockNoNotBetween(Object value1, Object value2) {
            addCriterion("block_no not between", value1, value2, "blockNo");
            return (Criteria) this;
        }

        public Criteria andPreviousIdIsNull() {
            addCriterion("previous_id is null");
            return (Criteria) this;
        }

        public Criteria andPreviousIdIsNotNull() {
            addCriterion("previous_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousIdEqualTo(Long value) {
            addCriterion("previous_id =", value, "previousId");
            return (Criteria) this;
        }

        public Criteria andPreviousIdNotEqualTo(Long value) {
            addCriterion("previous_id <>", value, "previousId");
            return (Criteria) this;
        }

        public Criteria andPreviousIdGreaterThan(Long value) {
            addCriterion("previous_id >", value, "previousId");
            return (Criteria) this;
        }

        public Criteria andPreviousIdGreaterThanOrEqualTo(Long value) {
            addCriterion("previous_id >=", value, "previousId");
            return (Criteria) this;
        }

        public Criteria andPreviousIdLessThan(Long value) {
            addCriterion("previous_id <", value, "previousId");
            return (Criteria) this;
        }

        public Criteria andPreviousIdLessThanOrEqualTo(Long value) {
            addCriterion("previous_id <=", value, "previousId");
            return (Criteria) this;
        }

        public Criteria andPreviousIdIn(List<Long> values) {
            addCriterion("previous_id in", values, "previousId");
            return (Criteria) this;
        }

        public Criteria andPreviousIdNotIn(List<Long> values) {
            addCriterion("previous_id not in", values, "previousId");
            return (Criteria) this;
        }

        public Criteria andPreviousIdBetween(Long value1, Long value2) {
            addCriterion("previous_id between", value1, value2, "previousId");
            return (Criteria) this;
        }

        public Criteria andPreviousIdNotBetween(Long value1, Long value2) {
            addCriterion("previous_id not between", value1, value2, "previousId");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdIsNull() {
            addCriterion("slot_leader_id is null");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdIsNotNull() {
            addCriterion("slot_leader_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdEqualTo(Long value) {
            addCriterion("slot_leader_id =", value, "slotLeaderId");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdNotEqualTo(Long value) {
            addCriterion("slot_leader_id <>", value, "slotLeaderId");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdGreaterThan(Long value) {
            addCriterion("slot_leader_id >", value, "slotLeaderId");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("slot_leader_id >=", value, "slotLeaderId");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdLessThan(Long value) {
            addCriterion("slot_leader_id <", value, "slotLeaderId");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdLessThanOrEqualTo(Long value) {
            addCriterion("slot_leader_id <=", value, "slotLeaderId");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdIn(List<Long> values) {
            addCriterion("slot_leader_id in", values, "slotLeaderId");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdNotIn(List<Long> values) {
            addCriterion("slot_leader_id not in", values, "slotLeaderId");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdBetween(Long value1, Long value2) {
            addCriterion("slot_leader_id between", value1, value2, "slotLeaderId");
            return (Criteria) this;
        }

        public Criteria andSlotLeaderIdNotBetween(Long value1, Long value2) {
            addCriterion("slot_leader_id not between", value1, value2, "slotLeaderId");
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTxCountIsNull() {
            addCriterion("tx_count is null");
            return (Criteria) this;
        }

        public Criteria andTxCountIsNotNull() {
            addCriterion("tx_count is not null");
            return (Criteria) this;
        }

        public Criteria andTxCountEqualTo(Long value) {
            addCriterion("tx_count =", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountNotEqualTo(Long value) {
            addCriterion("tx_count <>", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountGreaterThan(Long value) {
            addCriterion("tx_count >", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountGreaterThanOrEqualTo(Long value) {
            addCriterion("tx_count >=", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountLessThan(Long value) {
            addCriterion("tx_count <", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountLessThanOrEqualTo(Long value) {
            addCriterion("tx_count <=", value, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountIn(List<Long> values) {
            addCriterion("tx_count in", values, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountNotIn(List<Long> values) {
            addCriterion("tx_count not in", values, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountBetween(Long value1, Long value2) {
            addCriterion("tx_count between", value1, value2, "txCount");
            return (Criteria) this;
        }

        public Criteria andTxCountNotBetween(Long value1, Long value2) {
            addCriterion("tx_count not between", value1, value2, "txCount");
            return (Criteria) this;
        }

        public Criteria andProtoMajorIsNull() {
            addCriterion("proto_major is null");
            return (Criteria) this;
        }

        public Criteria andProtoMajorIsNotNull() {
            addCriterion("proto_major is not null");
            return (Criteria) this;
        }

        public Criteria andProtoMajorEqualTo(Object value) {
            addCriterion("proto_major =", value, "protoMajor");
            return (Criteria) this;
        }

        public Criteria andProtoMajorNotEqualTo(Object value) {
            addCriterion("proto_major <>", value, "protoMajor");
            return (Criteria) this;
        }

        public Criteria andProtoMajorGreaterThan(Object value) {
            addCriterion("proto_major >", value, "protoMajor");
            return (Criteria) this;
        }

        public Criteria andProtoMajorGreaterThanOrEqualTo(Object value) {
            addCriterion("proto_major >=", value, "protoMajor");
            return (Criteria) this;
        }

        public Criteria andProtoMajorLessThan(Object value) {
            addCriterion("proto_major <", value, "protoMajor");
            return (Criteria) this;
        }

        public Criteria andProtoMajorLessThanOrEqualTo(Object value) {
            addCriterion("proto_major <=", value, "protoMajor");
            return (Criteria) this;
        }

        public Criteria andProtoMajorIn(List<Object> values) {
            addCriterion("proto_major in", values, "protoMajor");
            return (Criteria) this;
        }

        public Criteria andProtoMajorNotIn(List<Object> values) {
            addCriterion("proto_major not in", values, "protoMajor");
            return (Criteria) this;
        }

        public Criteria andProtoMajorBetween(Object value1, Object value2) {
            addCriterion("proto_major between", value1, value2, "protoMajor");
            return (Criteria) this;
        }

        public Criteria andProtoMajorNotBetween(Object value1, Object value2) {
            addCriterion("proto_major not between", value1, value2, "protoMajor");
            return (Criteria) this;
        }

        public Criteria andProtoMinorIsNull() {
            addCriterion("proto_minor is null");
            return (Criteria) this;
        }

        public Criteria andProtoMinorIsNotNull() {
            addCriterion("proto_minor is not null");
            return (Criteria) this;
        }

        public Criteria andProtoMinorEqualTo(Object value) {
            addCriterion("proto_minor =", value, "protoMinor");
            return (Criteria) this;
        }

        public Criteria andProtoMinorNotEqualTo(Object value) {
            addCriterion("proto_minor <>", value, "protoMinor");
            return (Criteria) this;
        }

        public Criteria andProtoMinorGreaterThan(Object value) {
            addCriterion("proto_minor >", value, "protoMinor");
            return (Criteria) this;
        }

        public Criteria andProtoMinorGreaterThanOrEqualTo(Object value) {
            addCriterion("proto_minor >=", value, "protoMinor");
            return (Criteria) this;
        }

        public Criteria andProtoMinorLessThan(Object value) {
            addCriterion("proto_minor <", value, "protoMinor");
            return (Criteria) this;
        }

        public Criteria andProtoMinorLessThanOrEqualTo(Object value) {
            addCriterion("proto_minor <=", value, "protoMinor");
            return (Criteria) this;
        }

        public Criteria andProtoMinorIn(List<Object> values) {
            addCriterion("proto_minor in", values, "protoMinor");
            return (Criteria) this;
        }

        public Criteria andProtoMinorNotIn(List<Object> values) {
            addCriterion("proto_minor not in", values, "protoMinor");
            return (Criteria) this;
        }

        public Criteria andProtoMinorBetween(Object value1, Object value2) {
            addCriterion("proto_minor between", value1, value2, "protoMinor");
            return (Criteria) this;
        }

        public Criteria andProtoMinorNotBetween(Object value1, Object value2) {
            addCriterion("proto_minor not between", value1, value2, "protoMinor");
            return (Criteria) this;
        }

        public Criteria andVrfKeyIsNull() {
            addCriterion("vrf_key is null");
            return (Criteria) this;
        }

        public Criteria andVrfKeyIsNotNull() {
            addCriterion("vrf_key is not null");
            return (Criteria) this;
        }

        public Criteria andVrfKeyEqualTo(String value) {
            addCriterion("vrf_key =", value, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andVrfKeyNotEqualTo(String value) {
            addCriterion("vrf_key <>", value, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andVrfKeyGreaterThan(String value) {
            addCriterion("vrf_key >", value, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andVrfKeyGreaterThanOrEqualTo(String value) {
            addCriterion("vrf_key >=", value, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andVrfKeyLessThan(String value) {
            addCriterion("vrf_key <", value, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andVrfKeyLessThanOrEqualTo(String value) {
            addCriterion("vrf_key <=", value, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andVrfKeyLike(String value) {
            addCriterion("vrf_key like", value, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andVrfKeyNotLike(String value) {
            addCriterion("vrf_key not like", value, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andVrfKeyIn(List<String> values) {
            addCriterion("vrf_key in", values, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andVrfKeyNotIn(List<String> values) {
            addCriterion("vrf_key not in", values, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andVrfKeyBetween(String value1, String value2) {
            addCriterion("vrf_key between", value1, value2, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andVrfKeyNotBetween(String value1, String value2) {
            addCriterion("vrf_key not between", value1, value2, "vrfKey");
            return (Criteria) this;
        }

        public Criteria andOpCertIsNull() {
            addCriterion("op_cert is null");
            return (Criteria) this;
        }

        public Criteria andOpCertIsNotNull() {
            addCriterion("op_cert is not null");
            return (Criteria) this;
        }

        public Criteria andOpCertEqualTo(Object value) {
            addCriterion("op_cert =", value, "opCert");
            return (Criteria) this;
        }

        public Criteria andOpCertNotEqualTo(Object value) {
            addCriterion("op_cert <>", value, "opCert");
            return (Criteria) this;
        }

        public Criteria andOpCertGreaterThan(Object value) {
            addCriterion("op_cert >", value, "opCert");
            return (Criteria) this;
        }

        public Criteria andOpCertGreaterThanOrEqualTo(Object value) {
            addCriterion("op_cert >=", value, "opCert");
            return (Criteria) this;
        }

        public Criteria andOpCertLessThan(Object value) {
            addCriterion("op_cert <", value, "opCert");
            return (Criteria) this;
        }

        public Criteria andOpCertLessThanOrEqualTo(Object value) {
            addCriterion("op_cert <=", value, "opCert");
            return (Criteria) this;
        }

        public Criteria andOpCertIn(List<Object> values) {
            addCriterion("op_cert in", values, "opCert");
            return (Criteria) this;
        }

        public Criteria andOpCertNotIn(List<Object> values) {
            addCriterion("op_cert not in", values, "opCert");
            return (Criteria) this;
        }

        public Criteria andOpCertBetween(Object value1, Object value2) {
            addCriterion("op_cert between", value1, value2, "opCert");
            return (Criteria) this;
        }

        public Criteria andOpCertNotBetween(Object value1, Object value2) {
            addCriterion("op_cert not between", value1, value2, "opCert");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterIsNull() {
            addCriterion("op_cert_counter is null");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterIsNotNull() {
            addCriterion("op_cert_counter is not null");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterEqualTo(Object value) {
            addCriterion("op_cert_counter =", value, "opCertCounter");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterNotEqualTo(Object value) {
            addCriterion("op_cert_counter <>", value, "opCertCounter");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterGreaterThan(Object value) {
            addCriterion("op_cert_counter >", value, "opCertCounter");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterGreaterThanOrEqualTo(Object value) {
            addCriterion("op_cert_counter >=", value, "opCertCounter");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterLessThan(Object value) {
            addCriterion("op_cert_counter <", value, "opCertCounter");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterLessThanOrEqualTo(Object value) {
            addCriterion("op_cert_counter <=", value, "opCertCounter");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterIn(List<Object> values) {
            addCriterion("op_cert_counter in", values, "opCertCounter");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterNotIn(List<Object> values) {
            addCriterion("op_cert_counter not in", values, "opCertCounter");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterBetween(Object value1, Object value2) {
            addCriterion("op_cert_counter between", value1, value2, "opCertCounter");
            return (Criteria) this;
        }

        public Criteria andOpCertCounterNotBetween(Object value1, Object value2) {
            addCriterion("op_cert_counter not between", value1, value2, "opCertCounter");
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
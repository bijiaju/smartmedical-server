package com.hp.docker_base.bean;

import java.util.ArrayList;
import java.util.List;

public class MDC2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MDC2Example() {
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

        public Criteria andRuleIsNull() {
            addCriterion("Rule is null");
            return (Criteria) this;
        }

        public Criteria andRuleIsNotNull() {
            addCriterion("Rule is not null");
            return (Criteria) this;
        }

        public Criteria andRuleEqualTo(Integer value) {
            addCriterion("Rule =", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotEqualTo(Integer value) {
            addCriterion("Rule <>", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThan(Integer value) {
            addCriterion("Rule >", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("Rule >=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThan(Integer value) {
            addCriterion("Rule <", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleLessThanOrEqualTo(Integer value) {
            addCriterion("Rule <=", value, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleIn(List<Integer> values) {
            addCriterion("Rule in", values, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotIn(List<Integer> values) {
            addCriterion("Rule not in", values, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleBetween(Integer value1, Integer value2) {
            addCriterion("Rule between", value1, value2, "rule");
            return (Criteria) this;
        }

        public Criteria andRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("Rule not between", value1, value2, "rule");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNull() {
            addCriterion("reference is null");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNotNull() {
            addCriterion("reference is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceEqualTo(String value) {
            addCriterion("reference =", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotEqualTo(String value) {
            addCriterion("reference <>", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThan(String value) {
            addCriterion("reference >", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("reference >=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThan(String value) {
            addCriterion("reference <", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThanOrEqualTo(String value) {
            addCriterion("reference <=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLike(String value) {
            addCriterion("reference like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotLike(String value) {
            addCriterion("reference not like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceIn(List<String> values) {
            addCriterion("reference in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotIn(List<String> values) {
            addCriterion("reference not in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceBetween(String value1, String value2) {
            addCriterion("reference between", value1, value2, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotBetween(String value1, String value2) {
            addCriterion("reference not between", value1, value2, "reference");
            return (Criteria) this;
        }

        public Criteria andBeliefIsNull() {
            addCriterion("belief is null");
            return (Criteria) this;
        }

        public Criteria andBeliefIsNotNull() {
            addCriterion("belief is not null");
            return (Criteria) this;
        }

        public Criteria andBeliefEqualTo(String value) {
            addCriterion("belief =", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotEqualTo(String value) {
            addCriterion("belief <>", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefGreaterThan(String value) {
            addCriterion("belief >", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefGreaterThanOrEqualTo(String value) {
            addCriterion("belief >=", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLessThan(String value) {
            addCriterion("belief <", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLessThanOrEqualTo(String value) {
            addCriterion("belief <=", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLike(String value) {
            addCriterion("belief like", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotLike(String value) {
            addCriterion("belief not like", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefIn(List<String> values) {
            addCriterion("belief in", values, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotIn(List<String> values) {
            addCriterion("belief not in", values, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefBetween(String value1, String value2) {
            addCriterion("belief between", value1, value2, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotBetween(String value1, String value2) {
            addCriterion("belief not between", value1, value2, "belief");
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
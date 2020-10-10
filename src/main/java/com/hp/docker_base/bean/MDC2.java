package com.hp.docker_base.bean;

public class MDC2 {
    private Integer rule;

    private String reference;

    private String belief;

    public Integer getRule() {
        return rule;
    }

    public void setRule(Integer rule) {
        this.rule = rule;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    public String getBelief() {
        return belief;
    }

    public void setBelief(String belief) {
        this.belief = belief == null ? null : belief.trim();
    }
}
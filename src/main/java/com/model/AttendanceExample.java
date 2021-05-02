package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceExample() {
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

        public Criteria andAttendanceIdIsNull() {
            addCriterion("attendance_id is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdIsNotNull() {
            addCriterion("attendance_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdEqualTo(Integer value) {
            addCriterion("attendance_id =", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotEqualTo(Integer value) {
            addCriterion("attendance_id <>", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdGreaterThan(Integer value) {
            addCriterion("attendance_id >", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attendance_id >=", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdLessThan(Integer value) {
            addCriterion("attendance_id <", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("attendance_id <=", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdIn(List<Integer> values) {
            addCriterion("attendance_id in", values, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotIn(List<Integer> values) {
            addCriterion("attendance_id not in", values, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdBetween(Integer value1, Integer value2) {
            addCriterion("attendance_id between", value1, value2, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attendance_id not between", value1, value2, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(String value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(String value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(String value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(String value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(String value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(String value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLike(String value) {
            addCriterion("day like", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotLike(String value) {
            addCriterion("day not like", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<String> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<String> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(String value1, String value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(String value1, String value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andRecord1IsNull() {
            addCriterion("record1 is null");
            return (Criteria) this;
        }

        public Criteria andRecord1IsNotNull() {
            addCriterion("record1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecord1EqualTo(String value) {
            addCriterion("record1 =", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1NotEqualTo(String value) {
            addCriterion("record1 <>", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1GreaterThan(String value) {
            addCriterion("record1 >", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1GreaterThanOrEqualTo(String value) {
            addCriterion("record1 >=", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1LessThan(String value) {
            addCriterion("record1 <", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1LessThanOrEqualTo(String value) {
            addCriterion("record1 <=", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1Like(String value) {
            addCriterion("record1 like", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1NotLike(String value) {
            addCriterion("record1 not like", value, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1In(List<String> values) {
            addCriterion("record1 in", values, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1NotIn(List<String> values) {
            addCriterion("record1 not in", values, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1Between(String value1, String value2) {
            addCriterion("record1 between", value1, value2, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord1NotBetween(String value1, String value2) {
            addCriterion("record1 not between", value1, value2, "record1");
            return (Criteria) this;
        }

        public Criteria andRecord2IsNull() {
            addCriterion("record2 is null");
            return (Criteria) this;
        }

        public Criteria andRecord2IsNotNull() {
            addCriterion("record2 is not null");
            return (Criteria) this;
        }

        public Criteria andRecord2EqualTo(String value) {
            addCriterion("record2 =", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2NotEqualTo(String value) {
            addCriterion("record2 <>", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2GreaterThan(String value) {
            addCriterion("record2 >", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2GreaterThanOrEqualTo(String value) {
            addCriterion("record2 >=", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2LessThan(String value) {
            addCriterion("record2 <", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2LessThanOrEqualTo(String value) {
            addCriterion("record2 <=", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2Like(String value) {
            addCriterion("record2 like", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2NotLike(String value) {
            addCriterion("record2 not like", value, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2In(List<String> values) {
            addCriterion("record2 in", values, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2NotIn(List<String> values) {
            addCriterion("record2 not in", values, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2Between(String value1, String value2) {
            addCriterion("record2 between", value1, value2, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord2NotBetween(String value1, String value2) {
            addCriterion("record2 not between", value1, value2, "record2");
            return (Criteria) this;
        }

        public Criteria andRecord3IsNull() {
            addCriterion("record3 is null");
            return (Criteria) this;
        }

        public Criteria andRecord3IsNotNull() {
            addCriterion("record3 is not null");
            return (Criteria) this;
        }

        public Criteria andRecord3EqualTo(String value) {
            addCriterion("record3 =", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3NotEqualTo(String value) {
            addCriterion("record3 <>", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3GreaterThan(String value) {
            addCriterion("record3 >", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3GreaterThanOrEqualTo(String value) {
            addCriterion("record3 >=", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3LessThan(String value) {
            addCriterion("record3 <", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3LessThanOrEqualTo(String value) {
            addCriterion("record3 <=", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3Like(String value) {
            addCriterion("record3 like", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3NotLike(String value) {
            addCriterion("record3 not like", value, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3In(List<String> values) {
            addCriterion("record3 in", values, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3NotIn(List<String> values) {
            addCriterion("record3 not in", values, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3Between(String value1, String value2) {
            addCriterion("record3 between", value1, value2, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord3NotBetween(String value1, String value2) {
            addCriterion("record3 not between", value1, value2, "record3");
            return (Criteria) this;
        }

        public Criteria andRecord4IsNull() {
            addCriterion("record4 is null");
            return (Criteria) this;
        }

        public Criteria andRecord4IsNotNull() {
            addCriterion("record4 is not null");
            return (Criteria) this;
        }

        public Criteria andRecord4EqualTo(String value) {
            addCriterion("record4 =", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4NotEqualTo(String value) {
            addCriterion("record4 <>", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4GreaterThan(String value) {
            addCriterion("record4 >", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4GreaterThanOrEqualTo(String value) {
            addCriterion("record4 >=", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4LessThan(String value) {
            addCriterion("record4 <", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4LessThanOrEqualTo(String value) {
            addCriterion("record4 <=", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4Like(String value) {
            addCriterion("record4 like", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4NotLike(String value) {
            addCriterion("record4 not like", value, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4In(List<String> values) {
            addCriterion("record4 in", values, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4NotIn(List<String> values) {
            addCriterion("record4 not in", values, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4Between(String value1, String value2) {
            addCriterion("record4 between", value1, value2, "record4");
            return (Criteria) this;
        }

        public Criteria andRecord4NotBetween(String value1, String value2) {
            addCriterion("record4 not between", value1, value2, "record4");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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
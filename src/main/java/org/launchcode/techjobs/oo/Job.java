package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public org.launchcode.techjobs.oo.Employer getEmployer() {
        return employer;
    }

    public org.launchcode.techjobs.oo.Location getLocation() {
        return location;
    }

    public org.launchcode.techjobs.oo.PositionType getPositionType() {
        return positionType;
    }

    public org.launchcode.techjobs.oo.CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(org.launchcode.techjobs.oo.Employer employer) {
        this.employer = employer;
    }

    public void setLocation(org.launchcode.techjobs.oo.Location location) {
        this.location = location;
    }

    public void setPositionType(org.launchcode.techjobs.oo.PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(org.launchcode.techjobs.oo.CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}





package com.stackroute;

public abstract class Electronics {
    private boolean status;

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public abstract void changeStatus();
}

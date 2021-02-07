package com.rentmanager.exception;

import java.util.List;

public class RentManagerClientException extends RentManagerException {

    private final ModelState modelState;

    public RentManagerClientException(final String message, final ModelState modelState) {
        super(message, null);
        this.modelState = modelState;
    }

    public static class ModelState {
        private final List<String> filters;

        public ModelState(final List<String> filters) {
            this.filters = filters;
        }

        public List<String> getFilters() {
            return filters;
        }
    }
}
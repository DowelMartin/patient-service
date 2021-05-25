package pl.wsiiz.patientservice.dto;

public enum Status {
        UNREALIZED(false),
        REALIZED(true),
        RESERVED(true);

        boolean forReservation;

        private Status(boolean isReserved) {
            forReservation = isReserved;
        }
}

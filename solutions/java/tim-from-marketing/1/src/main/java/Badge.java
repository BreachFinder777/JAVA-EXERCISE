class Badge {
    public String print(Integer id, String name, String department) {
        // Handle the ID: if null, leave empty; if present, format with brackets and a dash
        String idPrefix = (id == null) ? "" : String.format("[%d] - ", id);

        // Handle the Department: if null, default to "OWNER"; otherwise, convert to uppercase
        String deptName = (department == null) ? "OWNER" : department.toUpperCase();

        // Combine parts: [ID] - Name - DEPARTMENT
        return String.format("%s%s - %s", idPrefix, name, deptName);
    }
}
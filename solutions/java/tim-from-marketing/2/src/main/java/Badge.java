class Badge {
    public String print(Integer id, String name, String department) {
        // Logic for the ID prefix
        String idPart = "";
        if (id != null) {
            idPart = "[" + id + "] - ";
        }

        // Logic for the Department
        String deptPart;
        if (department != null) {
            deptPart = department.toUpperCase();
        } else {
            deptPart = "OWNER";
        }

        // Concatenate everything together
        return idPart + name + " - " + deptPart;
    }
}
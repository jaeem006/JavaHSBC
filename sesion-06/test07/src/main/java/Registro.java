public class Registro {

    public boolean valida (String username, String password, String confirmP) {
        if (username.isEmpty() || password.isEmpty() || confirmP.isEmpty()) return false;
        if (username.contains("#")) return false;
        if (password != confirmP) return false;
        if (password.length() < 8) return false;
        return true;
    }
}

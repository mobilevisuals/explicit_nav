import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Random;

@Named
@SessionScoped
public class NavController implements Serializable


{private boolean logged;
Random rand=new Random();

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public void randomize()
    {
        logged=rand.nextBoolean();
    }
}

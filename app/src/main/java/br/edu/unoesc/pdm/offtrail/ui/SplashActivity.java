package br.edu.unoesc.pdm.offtrail.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.WindowFeature;

import br.edu.unoesc.pdm.offtrail.R;

@Fullscreen
@EActivity(R.layout.activity_splash)
@WindowFeature(Window.FEATURE_NO_TITLE)
public class SplashActivity extends AppCompatActivity {

    @AfterViews
    public void inicializar(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //criando a intent de login
                Intent intent = new Intent(SplashActivity.this, PrincipalActivity.class);
                // chamando a tela de login
                startActivity(intent);
                // fechar tela de splash
                finish();
            }
        }, 4000);
    }
}

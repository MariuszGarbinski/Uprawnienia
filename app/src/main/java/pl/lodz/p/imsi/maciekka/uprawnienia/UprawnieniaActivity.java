package pl.lodz.p.imsi.maciekka.uprawnienia;

import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.Manifest;
import android.Manifest.permission;

public class UprawnieniaActivity extends AppCompatActivity {

    static final Integer LOCATION = 0x1;
    static final Integer CALL = 0x2;
    static final Integer WRITE_EXST = 0x3;
    static final Integer READ_EXST = 0x4;
    static final Integer CAMERA = 0x5;
    static final Integer ACCOUNTS = 0x6;
    static final Integer GPS_SETTINGS = 0x7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uprawnienia);
        //lokalizacja
        Button gps = (Button) findViewById(R.id.lokalizacja);
        gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        // Jeżeli uprawnienia dla naszej aplikacji nie są nadane to pokazywane jest stosowne zapytanie
                        // metoda shouldShowRequestPermissionRationale zwraca true jeżeli użytkownik nie podjął decyzji
                        if (ActivityCompat.shouldShowRequestPermissionRationale(UprawnieniaActivity.this, Manifest.permission.ACCESS_FINE_LOCATION)) {
                            // Jeżeli uprawnienie nie zostały nadane
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, LOCATION);
                        } else {
                            //Metoda requestPermissions jest wywoływana aby uzytkownik mógł podjąć decyzję o nadaniu uprawnien
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, LOCATION);
                        }
                    } else {
                        Toast.makeText(UprawnieniaActivity.this, " " + Manifest.permission.ACCESS_FINE_LOCATION + " uprawnienia zostały przyznane.", Toast.LENGTH_SHORT).show();
                    }
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(UprawnieniaActivity.this, " " + Manifest.permission.ACCESS_FINE_LOCATION + "Uprawnienia nie zostały nadane", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                }
            }

        });
        //Zapis na karcie
        Button writeExst = (Button) findViewById(R.id.write);
        writeExst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                        if (ActivityCompat.shouldShowRequestPermissionRationale(UprawnieniaActivity.this, permission.WRITE_EXTERNAL_STORAGE)) {
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{permission.WRITE_EXTERNAL_STORAGE}, WRITE_EXST);
                        } else {
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{permission.WRITE_EXTERNAL_STORAGE}, WRITE_EXST);
                        }
                    } else {
                        Toast.makeText(UprawnieniaActivity.this, " " + permission.WRITE_EXTERNAL_STORAGE + " uprawnienia zostały przyznane.", Toast.LENGTH_SHORT).show();
                    }
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(UprawnieniaActivity.this, " " + permission.WRITE_EXTERNAL_STORAGE + "Uprawnienia nie zostały nadane", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                }
            }

        });
        //Odczyt z karty
        Button readExst = (Button) findViewById(R.id.read);
        readExst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                        if (ActivityCompat.shouldShowRequestPermissionRationale(UprawnieniaActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)) {
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, READ_EXST);
                        } else {
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, READ_EXST);
                        }
                    } else {
                        Toast.makeText(UprawnieniaActivity.this, " " + Manifest.permission.READ_EXTERNAL_STORAGE + " uprawnienia zostały przyznane.", Toast.LENGTH_SHORT).show();
                    }
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(UprawnieniaActivity.this, " " + Manifest.permission.READ_EXTERNAL_STORAGE + "Uprawnienia nie zostały nadane", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                }
            }

        });
        //Połączenia telefoniczne
        Button call = (Button) findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        if (ActivityCompat.shouldShowRequestPermissionRationale(UprawnieniaActivity.this, permission.CALL_PHONE)) {
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{permission.CALL_PHONE}, CALL);
                        } else {
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{permission.CALL_PHONE}, CALL);
                        }
                    } else {
                        Toast.makeText(UprawnieniaActivity.this, " " + permission.CALL_PHONE + " uprawnienia zostały przyznane.", Toast.LENGTH_SHORT).show();
                    }
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(UprawnieniaActivity.this, " " + permission.CALL_PHONE + "Uprawnienia nie zostały nadane", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                }
            }

        });
        //Kamera
        Button camera = (Button) findViewById(R.id.camera);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                        if (ActivityCompat.shouldShowRequestPermissionRationale(UprawnieniaActivity.this, permission.CAMERA)) {
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{permission.CAMERA}, CAMERA);
                        } else {
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{permission.CAMERA}, CAMERA);
                        }
                    } else {
                        Toast.makeText(UprawnieniaActivity.this, " " + permission.CAMERA + " uprawnienia zostały przyznane.", Toast.LENGTH_SHORT).show();
                    }
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(UprawnieniaActivity.this, " " + permission.CAMERA + "Uprawnienia nie zostały nadane", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                }
            }

        });
        //Kontakty
        Button contacts = (Button) findViewById(R.id.accounts);
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {
                        if (ActivityCompat.shouldShowRequestPermissionRationale(UprawnieniaActivity.this, permission.READ_CONTACTS)) {
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{permission.READ_CONTACTS}, ACCOUNTS);
                        } else {
                            ActivityCompat.requestPermissions(UprawnieniaActivity.this, new String[]{permission.READ_CONTACTS}, ACCOUNTS);
                        }
                    } else {
                        Toast.makeText(UprawnieniaActivity.this, " " + permission.READ_CONTACTS + " uprawnienia zostały przyznane.", Toast.LENGTH_SHORT).show();
                    }
                    if (ActivityCompat.checkSelfPermission(UprawnieniaActivity.this, permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(UprawnieniaActivity.this, " " + permission.READ_CONTACTS + "Uprawnienia nie zostały nadane", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(UprawnieniaActivity.this, "Wersja SDK systemu Android :  " + Build.VERSION.SDK_INT, Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {

            case 1:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(getApplicationContext(),"Odpowiedź uzytkownika pozytywna uprawnienia nadane",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Odpowiedź uzytkownika negatywna brak uprawnień",Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}

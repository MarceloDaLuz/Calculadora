package up.edu.br.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int operacao = 0;
    Double valor1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView resultadoconta = (TextView)findViewById(R.id.tv_resultado);

        Button btn0 = (Button)findViewById(R.id.btn0);
        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button)findViewById(R.id.btn5);
        Button btn6 = (Button)findViewById(R.id.btn6);
        Button btn7 = (Button)findViewById(R.id.btn7);
        Button btn8 = (Button)findViewById(R.id.btn8);
        Button btn9 = (Button)findViewById(R.id.btn9);
        Button btn_result = (Button)findViewById(R.id.btn_result);
        Button btn_mais = (Button)findViewById(R.id.btn_mais);
        Button btn_menos = (Button)findViewById(R.id.btn_menos);
        Button btn_multiplicacao = (Button)findViewById(R.id.btn_multiplicacao);
        Button btn_divisao = (Button)findViewById(R.id.btn_divisao);

        btn0.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    resultadoconta.setText("0");
                }
            }
        );
        btn1.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        resultadoconta.setText(resultadoconta.getText() + "1");
                                    }
                                }
        );
        btn2.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        resultadoconta.setText(resultadoconta.getText() + "2");
                                    }
                                }
        );
        btn3.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        resultadoconta.setText(resultadoconta.getText() + "3");
                                    }
                                }
        );
        btn4.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        resultadoconta.setText(resultadoconta.getText() + "4");
                                    }
                                }
        );
        btn5.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        resultadoconta.setText(resultadoconta.getText() + "5");
                                    }
                                }
        );
        btn6.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        resultadoconta.setText(resultadoconta.getText() + "6");
                                    }
                                }
        );
        btn7.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        resultadoconta.setText(resultadoconta.getText() + "7");
                                    }
                                }
        );
        btn8.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        resultadoconta.setText(resultadoconta.getText() + "8");
                                    }
                                }
        );
        btn9.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        resultadoconta.setText(resultadoconta.getText() + "9");
                                    }
                                }
        );
        btn_mais.setOnClickListener(new View.OnClickListener(){
                                                  @Override
                                                  public void onClick(View view){
                                                      valor1 = Double.valueOf(resultadoconta.getText().toString());
                                                      resultadoconta.setText("");
                                                      operacao = 1;
                                                  }
                                              }
        );
        btn_menos.setOnClickListener(new View.OnClickListener(){
                                        @Override
                                        public void onClick(View view){
                                            valor1 = Double.valueOf(resultadoconta.getText().toString());
                                            resultadoconta.setText("");
                                            operacao = 2;
                                        }
                                    }
        );
        btn_multiplicacao.setOnClickListener(new View.OnClickListener(){
                                         @Override
                                         public void onClick(View view){
                                             valor1 = Double.valueOf(resultadoconta.getText().toString());
                                             resultadoconta.setText("");
                                             operacao = 3;
                                         }
                                     }
        );
        btn_divisao.setOnClickListener(new View.OnClickListener(){
                                         @Override
                                         public void onClick(View view){
                                             valor1 = Double.valueOf(resultadoconta.getText().toString());
                                             resultadoconta.setText("");
                                             operacao = 4;
                                         }
                                     }
        );
        btn_result.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        Double valor2;
                                        valor2 = Double.parseDouble(resultadoconta.getText().toString());
                                        Double resultadoOperacao = 0.0;
                                        if (operacao == 1) {
                                            resultadoOperacao = valor1 + valor2;
                                        }
                                        if (operacao == 2) {
                                            resultadoOperacao = valor1 - valor2;
                                        }
                                        if (operacao == 3) {
                                            resultadoOperacao = valor1 * valor2;
                                        }
                                        if (operacao == 4) {
                                            resultadoOperacao = valor1 / valor2;
                                        }
                                        resultadoconta.setText(resultadoOperacao.toString());
                                    }
                                }
        );
    }
}

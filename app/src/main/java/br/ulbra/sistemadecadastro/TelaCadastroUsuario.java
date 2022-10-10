package br.ulbra.sistemadecadastro;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;

public class TelaCadastroUsuario {
    MainActivity act;
    EditText ednome,edendereco,edtelefone;
    Button btcadastrar,btcancelar,btcancelar_cadastro;
    TelaPrincipal tela_principal;

    public TelaCadastroUsuario(MainActivity act, TelaPrincipal tela_principal){
            this.act = act;
            this.tela_principal = tela_principal;
    }
    public void CarregarTela(){
        act.setContentView(R.layout.activity_cadastro);
        ednome = act.findViewById(R.id.edtnome);
        edendereco = act.findViewById(R.id.edtendereco);
        btcadastrar = act.findViewById(R.id.btcadastrar);
        btcancelar_cadastro = act.findViewById(R.id.btcancelar);

        btcadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Cadastrar usuário ?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String nome = ednome.getText().toString();
                        String telefone = edtelefone.getText().toString();
                        String endereco = edendereco.getText().toString();
                        act.getRegistros().add(new Registro(nome, endereco,telefone));
                        act.ExibirMensagem("Cadastro efetuado com sucesso.");
                        tela_principal.CarregarTela();
                    }
                });
                dialogo.show();
            }
        });
    }
}

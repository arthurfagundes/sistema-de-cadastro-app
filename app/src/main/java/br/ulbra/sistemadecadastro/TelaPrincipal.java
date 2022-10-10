package br.ulbra.sistemadecadastro;

import android.view.View;
import android.widget.Button;

public class TelaPrincipal {
    MainActivity act;
    Button btcadastrar_usuario;
    Button bt_listar_usuarios_cadastrados;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;
    public TelaPrincipal(MainActivity act){
        this.act = act;
    }
    public void CarregarTela(){
        act.setContentView(R.layout.activity_main);
        btcadastrar_usuario = act.findViewById(R.id.bt_reg_user);
        bt_listar_usuarios_cadastrados = act.findViewById(R.id.bt_list_reg_user);
        btcadastrar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_cadastro.CarregarTela();
            }
        });
        bt_listar_usuarios_cadastrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_listagem.CarregarTela();
            }
        });
    }
    public void  setTelaCadastro(TelaCadastroUsuario tela_cadastro){
        this.tela_cadastro = tela_cadastro;
    }
    public void setTelaListagem(TelaListagemUsuarios tela_listagem){
        this.tela_listagem = tela_listagem;
    }
}

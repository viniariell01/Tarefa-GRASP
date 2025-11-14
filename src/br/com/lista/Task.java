package br.com.lista;

/* Esta classe representa simplesmente o objeto de domínio "Tarefa".
  Mantém apenas seus próprios dados, garantindo Alta Coesão.
  Não aplica diretamente nenhum princípio GRASP, so é um "modelo"*/
public class Task {

    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

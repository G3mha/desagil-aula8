package br.edu.insper.desagil.aula8.mepipe;

import java.util.ArrayList;
import java.util.List;

public class Reaction {
    private List<String> reactions;

    public Reaction() {
        this.reactions = new ArrayList<>();
    }

    public void addReaction(String reaction) {
        this.reactions.add(reaction);
    }

    public List<String> getReactions() {
        return this.reactions;
    }
}
package com.example.steps;

import com.example.app.pages.Beli;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class BeliStep {

    @Steps
    Beli beli;

    @And("I click beli button")
    public void iClickBeliButton() {
        beli.beliBtn();
    }

    @Then("I get plus cart")
    public void iGetPlusCart() {
        beli.cartBtn();
    }
}

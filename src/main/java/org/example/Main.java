package org.example;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.infra.commands.CommandAddProductToCart;

public class Main extends JavaPlugin {
    @Override
    public void onEnable()
    {
        super.onEnable();
        System.out.println("Enabling plugin");
        this.getCommand("list-products").setExecutor(new CommandAddProductToCart());
        this.getCommand("add-product").setExecutor(new CommandAddProductToCart());
    }

    class  CartController {
        public void addProduct() {}
    }

    class MinecraftCartControllerAdapter {
        private CartController cartController;

        public MinecraftCartControllerAdapter(CartController cartController)
        {
            this.cartController = cartController;
        }

        public void addProduct()
        {
            this.cartController.addProduct();
        }
    }
}
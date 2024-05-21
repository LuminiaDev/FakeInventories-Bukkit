package com.mefrreex.fakeinventories;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

@Getter
public abstract class FakeInventoryAdapter implements Inventory {

    protected abstract @NotNull Inventory getInventory();

    @Override
    public int getSize() {
        return this.getInventory().getSize();
    }

    @Override
    public int getMaxStackSize() {
        return this.getInventory().getMaxStackSize();
    }

    @Override
    public void setMaxStackSize(int i) {
        this.getInventory().setMaxStackSize(i);
    }

    @Override
    public @Nullable ItemStack getItem(int i) {
        return this.getInventory().getItem(i);
    }

    @Override
    public void setItem(int i, @Nullable ItemStack itemStack) {
        this.getInventory().setItem(i, itemStack);
    }

    @Override
    public @NotNull HashMap<Integer, ItemStack> addItem(@NotNull ItemStack... itemStacks) throws IllegalArgumentException {
        return this.getInventory().addItem(itemStacks);
    }

    @Override
    public @NotNull HashMap<Integer, ItemStack> removeItem(@NotNull ItemStack... itemStacks) throws IllegalArgumentException {
        return this.getInventory().removeItem(itemStacks);
    }

    @Override
    public @NotNull HashMap<Integer, ItemStack> removeItemAnySlot(@NotNull ItemStack... itemStacks) throws IllegalArgumentException {
        return this.getInventory().removeItemAnySlot(itemStacks);
    }

    @Override
    public @Nullable ItemStack @NotNull [] getContents() {
        return this.getInventory().getContents();
    }

    @Override
    public void setContents(@Nullable ItemStack @NotNull [] itemStacks) throws IllegalArgumentException {
        this.getInventory().setContents(itemStacks);
    }

    @Override
    public @Nullable ItemStack @NotNull [] getStorageContents() {
        return this.getInventory().getStorageContents();
    }

    @Override
    public void setStorageContents(@Nullable ItemStack @NotNull [] itemStacks) throws IllegalArgumentException {
        this.getInventory().setStorageContents(itemStacks);
    }

    @Override
    public boolean contains(@NotNull Material material) throws IllegalArgumentException {
        return this.getInventory().contains(material);
    }

    @Override
    public boolean contains(@Nullable ItemStack itemStack) {
        return this.getInventory().contains(itemStack);
    }

    @Override
    public boolean contains(@NotNull Material material, int i) throws IllegalArgumentException {
        return this.getInventory().contains(material, i);
    }

    @Override
    public boolean contains(@Nullable ItemStack itemStack, int i) {
        return this.getInventory().contains(itemStack, i);
    }

    @Override
    public boolean containsAtLeast(@Nullable ItemStack itemStack, int i) {
        return this.getInventory().containsAtLeast(itemStack, i);
    }

    @Override
    public @NotNull HashMap<Integer, ? extends ItemStack> all(@NotNull Material material) throws IllegalArgumentException {
        return this.getInventory().all(material);
    }

    @Override
    public @NotNull HashMap<Integer, ? extends ItemStack> all(@Nullable ItemStack itemStack) {
        return this.getInventory().all(itemStack);
    }

    @Override
    public int first(@NotNull Material material) throws IllegalArgumentException {
        return this.getInventory().first(material);
    }

    @Override
    public int first(@NotNull ItemStack itemStack) {
        return this.getInventory().first(itemStack);
    }

    @Override
    public int firstEmpty() {
        return this.getInventory().firstEmpty();
    }

    @Override
    public boolean isEmpty() {
        return this.getInventory().isEmpty();
    }

    @Override
    public void remove(@NotNull Material material) throws IllegalArgumentException {
        this.getInventory().remove(material);
    }

    @Override
    public void remove(@NotNull ItemStack itemStack) {
        this.getInventory().remove(itemStack);
    }

    @Override
    public void clear(int i) {
        this.getInventory().clear(i);
    }

    @Override
    public void clear() {
        this.getInventory().clear();
    }

    @Override
    public int close() {
        return this.getInventory().close();
    }

    @Override
    public @NotNull List<HumanEntity> getViewers() {
        return this.getInventory().getViewers();
    }

    @Override
    public @NotNull InventoryType getType() {
        return this.getInventory().getType();
    }

    @Override
    public @Nullable InventoryHolder getHolder() {
        return this.getInventory().getHolder();
    }

    @Override
    public @Nullable InventoryHolder getHolder(boolean b) {
        return this.getInventory().getHolder(b);
    }

    @Override
    public @NotNull ListIterator<ItemStack> iterator() {
        return this.getInventory().iterator();
    }

    @Override
    public @NotNull ListIterator<ItemStack> iterator(int i) {
        return this.getInventory().iterator(i);
    }

    @Override
    public @Nullable Location getLocation() {
        return this.getInventory().getLocation();
    }
}

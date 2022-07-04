package org.example;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public String save() {
        return "save()";
    }

    @Override
    public String findAll() {
        return "findAll()";
    }

    @Override
    public String delete() {
        return "delete()";
    }

    @Override
    public String toString() {
        return "CocheCRUDImpl: "+this.save()+" | "+this.findAll()+" | "+this.delete();
    }
}

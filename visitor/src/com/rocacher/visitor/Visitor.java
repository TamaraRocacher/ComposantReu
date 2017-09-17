package com.rocacher.visitor;

public abstract class Visitor {
    protected Visitor(){};
    public abstract void visiteFile (File f);
    public abstract void visiteLnk (Link lnk);
    public abstract void visiteDir (Directory d);
    public abstract void visiteSymlnk(Symlink slnk);
}

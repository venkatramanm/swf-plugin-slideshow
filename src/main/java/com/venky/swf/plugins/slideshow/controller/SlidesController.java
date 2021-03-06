package com.venky.swf.plugins.slideshow.controller;

import com.venky.swf.controller.annotations.RequireLogin;
import com.venky.swf.db.Database;
import com.venky.swf.db.annotations.column.ui.mimes.MimeType;
import com.venky.swf.path.Path;
import com.venky.swf.plugins.slideshow.db.model.Attachment;
import com.venky.swf.plugins.slideshow.db.model.Slide;
import com.venky.swf.plugins.templates.controller.TemplatedModelController;
import com.venky.swf.views.BytesView;
import com.venky.swf.views.View;

import java.util.List;

public class SlidesController extends TemplatedModelController<Slide> {
    public SlidesController(Path path) {
        super(path);
    }

    @Override
    @RequireLogin(false)
    public View index() {
        return super.index();
    }

    @Override
    @RequireLogin(false)
    public View search() {
        return super.search();
    }
}

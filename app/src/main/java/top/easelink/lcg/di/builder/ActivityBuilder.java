package top.easelink.lcg.di.builder;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import top.easelink.lcg.ui.about.di.AboutFragmentProvider;
import top.easelink.lcg.ui.main.articles.di.ArticlesFragmentProvider;
import top.easelink.lcg.ui.main.view.MainActivity;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {AboutFragmentProvider.class, ArticlesFragmentProvider.class})
    abstract MainActivity bindMainActivity();

}

// Generated by Dagger (https://dagger.dev).
package com.example.mvctutorial.di_pre.ex8scope;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final DaggerAppComponent appComponent = this;

  private Provider<Application> providesApplicationProvider;

  private DaggerAppComponent(AppModule appModuleParam) {

    initialize(appModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam) {
    this.providesApplicationProvider = DoubleCheck.provider(AppModule_ProvidesApplicationFactory.create(appModuleParam));
  }

  @Override
  public Application getApplication() {
    return providesApplicationProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      return new DaggerAppComponent(appModule);
    }
  }
}

// Generated by Dagger (https://dagger.dev).
package com.example.mvctutorial.di_pre.ex4namedannotation;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Named;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Teacher_MembersInjector implements MembersInjector<Teacher> {
  private final Provider<String> nameProvider;

  public Teacher_MembersInjector(Provider<String> nameProvider) {
    this.nameProvider = nameProvider;
  }

  public static MembersInjector<Teacher> create(Provider<String> nameProvider) {
    return new Teacher_MembersInjector(nameProvider);
  }

  @Override
  public void injectMembers(Teacher instance) {
    injectName(instance, nameProvider.get());
  }

  @InjectedFieldSignature("com.example.mvctutorial.di.ex4namedannotation.Teacher.name")
  @Named("Teacher")
  public static void injectName(Teacher instance, String name) {
    instance.name = name;
  }
}

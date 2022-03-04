// Generated by Dagger (https://dagger.dev).
package com.example.mvctutorial.di_pre.ex3memberinjection;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Student_MembersInjector implements MembersInjector<Student> {
  private final Provider<String> nameProvider;

  public Student_MembersInjector(Provider<String> nameProvider) {
    this.nameProvider = nameProvider;
  }

  public static MembersInjector<Student> create(Provider<String> nameProvider) {
    return new Student_MembersInjector(nameProvider);
  }

  @Override
  public void injectMembers(Student instance) {
    injectName(instance, nameProvider.get());
  }

  @InjectedFieldSignature("com.example.mvctutorial.di.ex3memberinjection.Student.name")
  public static void injectName(Student instance, String name) {
    instance.name = name;
  }
}

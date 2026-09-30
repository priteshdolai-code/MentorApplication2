# Mentor Application — Android

A native Android application for a college mentor–mentee programme, built in
Java. It covers the full navigation flow for three user roles — mentee, mentor,
and mentor head — across sign-up, profile creation, role-specific home screens,
profile viewing and editing, and notices.

This is the **Android version** of the mentor–mentee system. It was later
rebuilt as a web platform:
[academic-connect-portal](https://github.com/priteshdolai-code/academic-connect-portal).

> **Scope:** this is a UI and navigation prototype. All sixteen screens and the
> flows between them are built and working; the data layer is not implemented,
> so screens render their layouts rather than live records. See
> [Current State](#current-state) below.

## Tech Stack

| Concern | Technology |
|---|---|
| Language | Java 8 |
| Platform | Android (minSdk 24, targetSdk 33) |
| UI | XML layouts, Material Components, ConstraintLayout |
| Navigation | Activities + explicit Intents |
| Build | Gradle |
| IDE | Android Studio |

## Screens

Sixteen activities, organised by role:

**Entry**
`MainActivity` → `LogInPage` / `SignUpPage` → `RolePage`

**Mentee**
`StudentHomePage` · `CreateProfilePage` · `StudentProfilePage` · `StudentUpdatePage`

**Mentor**
`MentorHomePage` · `MentorProfileCreationPage` · `MentorProfilePage` · `MentorUpdatePage`

**Mentor Head**
`MentorHeadHomePage` · `PutNotification`

**Shared**
`Profile` · `Notification`

## Structure

```
app/src/main/
  java/com/viva/mentorapplication/    16 activity classes
  res/layout/                          XML layouts per screen
  res/values/                          themes, strings, colours
  AndroidManifest.xml                  activity registration
app/build.gradle                       dependencies and SDK config
```

## Building and Running

**Prerequisites:** Android Studio, JDK 8+, Android SDK 33.

```bash
git clone https://github.com/priteshdolai-code/MentorApplication2.git
```

Open the project in Android Studio, let Gradle sync, then run on an emulator or
device running Android 7.0 (API 24) or newer.

## Design Notes

**Three roles, three home screens.** `RolePage` is the branch point: mentee,
mentor and mentor head each get a distinct home activity rather than one screen
that conditionally hides controls. Keeping the flows separate made each screen
simpler to lay out and to reason about, at the cost of some duplicated profile
logic between the mentor and student paths — the sort of duplication that would
be worth factoring into a shared base activity as the app grows.

**Separate view and edit screens.** Profile viewing and profile editing are
different activities (`StudentProfilePage` / `StudentUpdatePage`) rather than one
screen toggling between read-only and editable states. This keeps each layout
single-purpose and makes the back-stack behaviour predictable.

## Current State

What is built:

- All sixteen screens with their layouts
- Complete navigation graph between them, including the role branch
- Material theming applied across the app
- Retrofit and Gson declared as dependencies, ready for the API layer

What is not yet built:

- **No data layer.** There is no network client, database, or local storage —
  screens display their layouts rather than real records.
- **No authentication.** `LogInPage` navigates to role selection without
  verifying credentials; role is chosen manually rather than derived from a
  signed-in account.
- **No form persistence.** Profile creation and update screens collect input but
  do not save it.
- **No tests.**

The backend and data layer for this system were built in the web rebuild,
[academic-connect-portal](https://github.com/priteshdolai-code/academic-connect-portal),
which implements the authentication, role-based access, and MongoDB persistence
that this prototype was designed against.

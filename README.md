# app-dev-diu

App Development bootcamp work from the **DIU CPC Club**. Each task lives in
its own folder (`task_1/`, `task_2/`, ...). The repository is organized by
task so each assignment stays self-contained and easy to review.

## Repository layout

```
app-dev-diu/
├── task_1/
│   └── ArithmeticOperations.java   # Task 1 source file(s)
├── task_2/
│   └── ...                         # Task 2 source file(s)
├── task_3/
│   └── ...                         # Task 3 source file(s)
└── ...
```

### Conventions

- **One folder per task**, named `task_<n>/` where `<n>` is the task number.
- **Source files inside the task folder** only — keep all files for a single
  task together so nothing leaks across tasks.
- **No nested task folders** — don't put `task_2/` inside `task_1/`; each task
  sits directly under the repository root.
- **Match the task's required filenames** (e.g. `ArithmeticOperations.java`
  for Task 1). Use additional helper files inside the same `task_<n>/` folder
  if needed.

## Running the Java tasks

Each task is self-contained. Example for task 1:

```bash
cd task_1
javac ArithmeticOperations.java
java ArithmeticOperations
```
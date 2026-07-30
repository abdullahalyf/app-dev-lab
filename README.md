# app-dev-diu

Lab work for the App Development course at DIU. Each task lives in its own
folder (`task_1/`, `task_2/`, ...).

## Layout

```
app-dev-diu/
├── task_1/
│   └── ArithmeticOperations.java
├── task_2/
└── ...
```

## Daily workflow

1. Create a new folder for the task, e.g. `task_2/`.
2. Add your source files inside it.
3. Commit and push:

```bash
git add .
git commit -m "task 2: <short description>"
git push
```

## Running the Java tasks

Each task is self-contained. Example for task 1:

```bash
cd task_1
javac ArithmeticOperations.java
java ArithmeticOperations
```
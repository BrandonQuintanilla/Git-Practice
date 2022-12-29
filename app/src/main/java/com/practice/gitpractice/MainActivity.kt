package com.practice.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// change over branch-name, cherry-picked to cherrypick-test branch
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//      setContentView(R.layout.activity_main)




    }
}
/**
 * git branch new-branch-name ->  Crea un nuevo branch desde el nodo en el que me encuentro
 *
 * git branch new-branch-name commit-id -> Crea un branch desde el nodo con el ID especificado (revitionID-8digits)
 *
 * Solo se pueden crear braches en el repositorio local,
 * Crear un branch en el repositorio remoto implica PUBLICAR un branch que se encuentra en local
 *
 * git log -> muestra el listado de commits recientes
 * */

/**
 * git checkout other-branch-name
 * git switch other-branch-name
 * -> son comandos equivalentes , switch tiene por unica finalidad el cambiar de branch, checkout tiene muchos mas usos
 * */

/**
 * Renombrar un branch
 *
 * git branch -m new-name-branch -> modifica el nombre del current branch (HEAD branch)
 * git branch -m my-branch-name new-branch-name -> modifica el primer branch mencionado y lo renombra con el segundo parametro dado
 * "my-branch-name" se renombra a "new-branch-name"
 * */


/**
 * Para renombrar un branch en un repositorio remoto se elimina el branch remoto y se hace un push de un branch local renombrado
 * No se puede reombrar un branch remoto directamente
 *
 * #First, delete the current old branch
 * git push origin --delete old-name -> validar si "origin es correcto"
 *
 * #Then, simply push the new local branch with the correct name
 * git push -u origin new-name
 *
 * En realidad, se hace push branch por branch
 * git push -u origin branch-to-upload
 *
 *
 * OBS -> el flag "-u" indica que se establezca un "tracking connnection" lo cual hace el pushing y el pulling mucho mas facil
 * (Decidir si conviene o no establecer un tracking connection)
 *
 * TRACKING BRANCHES:
 * Por default, local and remote branches have nothing to do with each other
 *
 *
 * Una vez definidos los tracking connections, no es necesario definir un source branch o un destiny branch,
 * solo es necesario un git push y un git pull para sincronizar los repositorios locales y remotos.
 *
 * Otra ventaja del tracking connection es que se verifican los estados
 * [ahead X, behind Y] -> indica que se tienen X commtis localmente y no publicados en el repo remoto,
 * y se tienen Y commits en el branch remoto (correspondientemente conectado) sin que nuestro repo local haya alcanzado los updates
 *
 * git branch -v -> verifica los estados de los branch
 * */
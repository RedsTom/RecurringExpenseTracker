package ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import org.jetbrains.compose.resources.stringResource
import recurringexpensetracker.app.generated.resources.Res
import recurringexpensetracker.app.generated.resources.settings_about_app

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(
    navController: NavController,
) {
    Scaffold(
        topBar = {
            Row {
                TopAppBar(
                    navigationIcon = {
                        IconButton(
                            content = {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                                    contentDescription = null,
                                )
                            },
                            onClick = {
                                navController.popBackStack()
                            },
                        )
                    },
                    title = { Text(text = stringResource(Res.string.settings_about_app)) },
                )
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues),
            ) {
                Text("Ok")
            }
        },
    )
}

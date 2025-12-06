package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeploymentUnitTechnicalPresentation: ImageVector
    get() {
        val current = _deploymentUnitTechnicalPresentation
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DeploymentUnitTechnicalPresentation",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M19 23 h-2 V9 h6 a2 2 0 0 1 2 2 v5 a2 2 0 0 1 -2 2 h-4Z m0 -7 h4 v-5 h-4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 23
                moveTo(x = 19.0f, y = 23.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m 0 -7
                moveToRelative(dx = 0.0f, dy = -7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <polygon points="7.0 11.0 10.0 11.0 10.0 23.0 12.0 23.0 12.0 11.0 15.0 11.0 15.0 9.0 7.0 9.0 7.0 11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 11
                moveTo(x = 7.0f, y = 11.0f)
                // L 10 11
                lineTo(x = 10.0f, y = 11.0f)
                // L 10 23
                lineTo(x = 10.0f, y = 23.0f)
                // L 12 23
                lineTo(x = 12.0f, y = 23.0f)
                // L 12 11
                lineTo(x = 12.0f, y = 11.0f)
                // L 15 11
                lineTo(x = 15.0f, y = 11.0f)
                // L 15 9
                lineTo(x = 15.0f, y = 9.0f)
                // L 7 9
                lineTo(x = 7.0f, y = 9.0f)
                // L 7 11z
                lineTo(x = 7.0f, y = 11.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _deploymentUnitTechnicalPresentation = it }
    }

@Suppress("ObjectPropertyName")
private var _deploymentUnitTechnicalPresentation: ImageVector? = null

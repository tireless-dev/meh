package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InformationDisabled: ImageVector
    get() {
        val current = _informationDisabled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.InformationDisabled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 3.41 28.59 2 2 28.59 3.41 30 l3.45 -3.44 a13.96 13.96 0 0 0 19.7 -19.7Z M28 16 a11.97 11.97 0 0 1 -19.73 9.15 L15 18.4 V22 h-2 v2 h7 v-2 h-3 v-5.59 l8.15 -8.14 A12 12 0 0 1 28 16 M16 8 a1.5 1.5 0 1 0 1.5 1.5 A1.5 1.5 0 0 0 16 8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 3.41
                moveTo(x = 30.0f, y = 3.41f)
                // L 28.59 2
                lineTo(x = 28.59f, y = 2.0f)
                // L 2 28.59
                lineTo(x = 2.0f, y = 28.59f)
                // L 3.41 30
                lineTo(x = 3.41f, y = 30.0f)
                // l 3.45 -3.44
                lineToRelative(dx = 3.45f, dy = -3.44f)
                // a 13.96 13.96 0 0 0 19.7 -19.7z
                arcToRelative(
                    a = 13.96f,
                    b = 13.96f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 19.7f,
                    dy1 = -19.7f,
                )
                close()
                // M 28 16
                moveTo(x = 28.0f, y = 16.0f)
                // a 11.97 11.97 0 0 1 -19.73 9.15
                arcToRelative(
                    a = 11.97f,
                    b = 11.97f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -19.73f,
                    dy1 = 9.15f,
                )
                // L 15 18.4
                lineTo(x = 15.0f, y = 18.4f)
                // V 22
                verticalLineTo(y = 22.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -5.59
                verticalLineToRelative(dy = -5.59f)
                // l 8.15 -8.14
                lineToRelative(dx = 8.15f, dy = -8.14f)
                // A 12 12 0 0 1 28 16
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 16.0f,
                )
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
                // a 1.5 1.5 0 1 0 1.5 1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.5f,
                    dy1 = 1.5f,
                )
                // A 1.5 1.5 0 0 0 16 8
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 8.0f,
                )
            }
            // M5.67 22.09 A11.98 11.98 0 0 1 22.09 5.67 l1.45 -1.45 A13.99 13.99 0 0 0 4.22 23.54Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5.67 22.09
                moveTo(x = 5.67f, y = 22.09f)
                // A 11.98 11.98 0 0 1 22.09 5.67
                arcTo(
                    horizontalEllipseRadius = 11.98f,
                    verticalEllipseRadius = 11.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.09f,
                    y1 = 5.67f,
                )
                // l 1.45 -1.45
                lineToRelative(dx = 1.45f, dy = -1.45f)
                // A 13.99 13.99 0 0 0 4.22 23.54z
                arcTo(
                    horizontalEllipseRadius = 13.99f,
                    verticalEllipseRadius = 13.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.22f,
                    y1 = 23.54f,
                )
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
        }.build().also { _informationDisabled = it }
    }

@Suppress("ObjectPropertyName")
private var _informationDisabled: ImageVector? = null

package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CenterCircle: ImageVector
    get() {
        val current = _centerCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CenterCircle",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 15 h-2.05 A12 12 0 0 0 17 4.05 V2 h-2 v2.05 A12 12 0 0 0 4.05 15 H2 v2 h2.05 A12 12 0 0 0 15 27.95 V30 h2 v-2.05 A12 12 0 0 0 27.95 17 H30Z M17 25.95 V22 h-2 v3.95 A10 10 0 0 1 6.05 17 H10 v-2 H6.05 A10 10 0 0 1 15 6.05 V10 h2 V6.05 A10 10 0 0 1 25.95 15 H22 v2 h3.95 A10 10 0 0 1 17 25.95
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 15
                moveTo(x = 30.0f, y = 15.0f)
                // h -2.05
                horizontalLineToRelative(dx = -2.05f)
                // A 12 12 0 0 0 17 4.05
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 4.05f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2.05
                verticalLineToRelative(dy = 2.05f)
                // A 12 12 0 0 0 4.05 15
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.05f,
                    y1 = 15.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.05
                horizontalLineToRelative(dx = 2.05f)
                // A 12 12 0 0 0 15 27.95
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.0f,
                    y1 = 27.95f,
                )
                // V 30
                verticalLineTo(y = 30.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2.05
                verticalLineToRelative(dy = -2.05f)
                // A 12 12 0 0 0 27.95 17
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.95f,
                    y1 = 17.0f,
                )
                // H 30z
                horizontalLineTo(x = 30.0f)
                close()
                // M 17 25.95
                moveTo(x = 17.0f, y = 25.95f)
                // V 22
                verticalLineTo(y = 22.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3.95
                verticalLineToRelative(dy = 3.95f)
                // A 10 10 0 0 1 6.05 17
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.05f,
                    y1 = 17.0f,
                )
                // H 10
                horizontalLineTo(x = 10.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 6.05
                horizontalLineTo(x = 6.05f)
                // A 10 10 0 0 1 15 6.05
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 6.05f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6.05
                verticalLineTo(y = 6.05f)
                // A 10 10 0 0 1 25.95 15
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 25.95f,
                    y1 = 15.0f,
                )
                // H 22
                horizontalLineTo(x = 22.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3.95
                horizontalLineToRelative(dx = 3.95f)
                // A 10 10 0 0 1 17 25.95
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 25.95f,
                )
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
        }.build().also { _centerCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _centerCircle: ImageVector? = null

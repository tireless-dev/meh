package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PauseOutlineFilled: ImageVector
    get() {
        val current = _pauseOutlineFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PauseOutlineFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m-2 20 h-2 V10 h2Z m6 0 h-2 V10 h2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 14 14 0 1 0 14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 14.0f,
                )
                // A 14 14 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // m -2 20
                moveToRelative(dx = -2.0f, dy = 20.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m 6 0
                moveToRelative(dx = 6.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
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
        }.build().also { _pauseOutlineFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _pauseOutlineFilled: ImageVector? = null

package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ModelBuilder: ImageVector
    get() {
        val current = _modelBuilder
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ModelBuilder",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22 4 v3 H10 V4 H2 v8 h8 V9 h7.02 A5 5 0 0 0 16 12 v8 a3 3 0 0 1 -3 3 h-3 v-3 H2 v8 h8 v-3 h3 a5 5 0 0 0 5 -5 v-8 a3 3 0 0 1 3 -3 h1 v3 h8 V4Z M8 10 H4 V6 h4Z m0 16 H4 v-4 h4Z m20 -16 h-4 V6 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 4
                moveTo(x = 22.0f, y = 4.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 7.02
                horizontalLineToRelative(dx = 7.02f)
                // A 5 5 0 0 0 16 12
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 12.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // a 5 5 0 0 0 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
                // M 8 10
                moveTo(x = 8.0f, y = 10.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m 0 16
                moveToRelative(dx = 0.0f, dy = 16.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m 20 -16
                moveToRelative(dx = 20.0f, dy = -16.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
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
        }.build().also { _modelBuilder = it }
    }

@Suppress("ObjectPropertyName")
private var _modelBuilder: ImageVector? = null
